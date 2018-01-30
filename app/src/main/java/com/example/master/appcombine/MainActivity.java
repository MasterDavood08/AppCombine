package com.example.master.appcombine;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

import com.example.master.appcombine.LevelTree.MyNodeViewFactory;

import me.texy.treeview.TreeNode;
import me.texy.treeview.TreeView;

public class MainActivity extends BaseActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawerLayout;
    TreeNode root;

    String[] t = new String[]{"واحد برش", "واحد کوبش", "واحد جدا کننده (جدایش)", "واحد تمیز کننده (تمیزش)", "واحد ذخیره و تخلیه"};
    String[] v = new String[]{"وظیفه این واحد، بریدن محصول و کمک به انتقال آن به واحد کوبش است. واحد برش از اندام های عمده زیر تشکیل شده است:\n" +
            "الف) شانه برش\n" +
            "ب) جدا کننده ها\n" +
            "ج) چرخ فلک\n" +
            "د) هلیس\n"
            , "این واحد، محصول را با اعمال ضربه یا سایش می کوبد؛ طوری که دانه از خوشه جدا شده یا بیرون آید. این واحد شامل چهار بخش است.\n" +
            "الف) تسمه نقاله تغذیه: دو زنجیره بی انتها است که با نبشی های فلزی به هم پیوند داده شده است. تسمه نقاله با حرکت چرخشی خود، محصول را از واحد برش به کوبنده و ضد کوبنده می رساند.\n" +
            "ب) کوبنده: استوانه ای است به پهنای تسمه نقاله تغذیه و در پیرامون آن 6-8 ضربه زن نصب شده است و چهار نوع دارد. کوبنده ها انواع سوهانی، انگشتی، تیغه ای و نبشی دارد. \n" +
            "ج) ضد کوبنده: قطعه ای منحنی و سوراخ دار است. حدود 90 درصد از دانه های جدا شده از خوشه، از سوراخ های ضد کوبنده پایین می ریزند تا برای جدا کردن و تمیز نمودن به واحدهای مربوط منتقل شوند.\n" +
            "د) کلش کش: ساقه و برگ محصولات معمولاً تمایل به پیچیدن حول کوبنده دارند. کلش کش، وسیله¬ای است که از این کار ممانعت می¬کند؛ یعنی کلش را از کوبنده گرفته و به مسیر درست آن هدایت می¬نماید. این قطعه در پشت و بالای کوبنده تعبیه شده و خلاف کوبنده می چرخد.\n",
            "محصول پس از عمل کوبیدن، مخلوطی از دانه، کزل، کلش، کاه و خرده کاه است که باید از یکدیگر جدا شود. این عمل توسط واحد جدا کننده انجام می شود. جدا کننده از اجزا زیر تشکیل شده است:\n" +
                    "الف) غربال ها: قطعات سوراخ دار شیب داری هستند که دو حرکت رفت و برگشتی و بالا و پایین دارند. این طرز حرکت درست شبیه غربال کردن دستی است. حرکت غربال ضمن آنکه مخلوط دانه و مکش را به عقب می راند، آنها را بالا و پایین نیز می اندازد تا دانه بتواند به راحتی از بقیه مواد جدا شود. دانه از سوراخ های غربال ها به پایین، روی واحد تمیز کننده ریخته می شود. اندازه سوراخ غربال ها ممکن است ثابت یا قابل تنظیم باشد.\n" +
                    "ب) میل لنگ: دو حرکت رفت و برگشتی و بالا و پایین غربال ها توسط میل لنگ تولید می شود که شکل خاصی دارد. میل لنگ ها در یاتاقان های چوبین می چرخند. دو میل لنگ در اوایل و اواخر غربال ها نصب می شوند.\n" +
                    "ج) کزل گیر : صفحه ای مورب است که کزل ها ی پایین ریخته از غربال ها را به روی واحد تمیز کننده می اندازد.\n", "مرحله نهایی برداشت با کمباین، جدا کردن دانه از بقایا یعنی خرده کاه و کزل است. این واحد شامل اجزا زیر است:\n" +
            "الف) الک های بالایی و پایینی: الک بالایی با حرکت نوسانی خود، دانه ها و مواد سنگین تر را به عقب الک هدایت می کند. دانه ها و مواد سنگینی که اندازه آن ها کوچک تر از اندازه سوراخ های الک بالایی است، روی الک پایینی می ریزد. دانه ها از سوراخ های پایینی الک عبور می کند و از طریق سینی برگشت دانه های تمیز، بر روی هلیس پایینی دانه های تمیز می ریزند. \n" +
            "ب) بادبزن یا دمنده : در زیر و کنار الک ها دمنده ای نصب شده است که با وزش باد به زیر الک ها، خرده کاه را جدا کرده و از عقب کمباین بیرون می ریزد. بنابراین اگر به عقب کمباین نگاه کنیم، پس مانده ها از دو قسمت آن بیرون می ریزند. ساقه های خرد شده درشت یا کلش که از روی غربال ها بیرون می آید و مقدار آن ها زیاد است و دوم خرده کاه که از روی الک ها خارج شده و مقدار آن نسبتاً کم است.\n" +
            "ج) کزل برگردان: کزل (قطعات کوبیده نشده حاوی دانه) باید جمع آوری شده و برای دوباره کوبیدن به واحد کوبنده برگردانده شود. در زیر و پایین قسمت کمباین دو محفظه وجود دارد که در هر یک وسیله ای برای انتقال وجود دارد، یکی از آن ها کزل برگردان است که کزل را به واحد کوبنده بر می گرداند.\n", "دانه های تمیز را باید پس از پایین ریختن از الک ها از کمباین گرفته و در وسایل نقلیه همچون تریلر یا کامیون بارگیری نمود تا از مزرعه به سیلو یا بازار فروش برده شود. کمباین های قدیمی از نوع کیسه ای بودند ولی امروزه بیشتر انباره ای هستند. در نوع قدیمی، محلی برای اتصال 3 گونی وجود داشت. دانه های سالم در یکی، خرد شده و در دومی و کزل در سومی بارگیری می شدند. در کمباین انباره ای، محفظه ای در بالای کمباین تعبیه شده که گنجایش 7-1000 کیلوگرم دانه را دارد. دانه تمیز با نقاله از پایین کمباین به این مخزن منتقل می شود. پس از پر شدن مخزن، دانه در تریلر یا کامیون تخلیه می شود. واحد ذخیره و تخلیه دارای اجزا زیر است:\n" +
            "الف) هلیس و بالا بر دانه تمیز: به صورت محفظه ای مکعب مستطیلی و عمودی دیده می شود. نقاله ها از نوع زنجیره ای است که پره هایی در فواصل معین روی آن نصب شده است. پره ها وظیفه انتقال دانه را از واحد تمیز کننده به مخزن به عهده دارند. در بعضی از کمباین ها، این نقاله هلیسی است.\n" +
            "ب) مخزن دانه: مخزنی در بالای کمباین است که به شکل خاصی طراحی شده است. معمولاً نقاله هایی درون آن تعبیه شده اند تا بتوانند دانه را برای تخلیه آماده نمایند.\n" +
            "ج) لوله تخلیه: لوله ای نسبتاً بلند است که به طور ثابت یا گردان در پهلوی کمباین نصب می شود.\n"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);
        setContentView(R.layout.activity_main);
        ScrollView mainScrollView = (ScrollView) findViewById(R.id.scroll);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");

        NavigationView navigationView = (NavigationView) findViewById(R.id.mynav);
        navigationView.setNavigationItemSelectedListener(this);
        drawerLayout = (DrawerLayout) findViewById(R.id.mydrawer);
        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();

        ViewGroup viewGroup = (RelativeLayout) findViewById(R.id.container);
        root = TreeNode.root();

        buildTree();
        MyNodeViewFactory viewFactory = new MyNodeViewFactory();
        TreeView treeView = new TreeView(root, this, viewFactory);
        viewFactory.treeView = treeView;
        View view = treeView.getView();
        view.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        viewGroup.addView(view);


        mainScrollView.pageScroll(View.FOCUS_UP);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.navitem:

                break;
            case R.id.navitem1:
                startActivity(new Intent(MainActivity.this, CalActivity.class));
                break;
            case R.id.navitem2:
                startActivity(new Intent(MainActivity.this, QuestionActivity.class));
                break;
            case R.id.navitem3:
                startActivity(new Intent(MainActivity.this, ResourceActivity.class));
                break;
        }
        hidedrawer();
        return true;
    }

    private void buildTree() {
        for (int i = 0; i < t.length; i++) {
            TreeNode tree;
            tree = new TreeNode(t[i]);
            tree.setLevel(0);

            TreeNode tree1;
            tree1 = new TreeNode(v[i]);
            tree1.setLevel(1);

            tree.addChild(tree1);


            root.addChild(tree);
        }
    }

    private void hidedrawer() {
        drawerLayout.closeDrawer(Gravity.RIGHT);
    }

    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            hidedrawer();
        } else {
            super.onBackPressed();
        }
    }

}
