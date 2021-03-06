package com.example.master.appcombine;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;


import com.example.master.appcombine.LevelTree.MyNodeViewFactory;

import me.texy.treeview.TreeNode;
import me.texy.treeview.TreeView;

public class QuestionActivity extends BaseActivity {
    TreeNode root;
    String[] t = new String[]{"تنظیمات و رفع عیب در واحد برش", "تنظیمات و رفع عیب در واحد کوبش", "تنظیمات و رفع عیب در واحد جدا کننده و واحد تمیز کننده", "تنظیمات و رفع عیب در واحد ذخیره و تخلیه"};
    String[] q1 = new String[]{"آیا قبل از عمل برش، در اثر ضربه وارده به خوشه افت دانه اتفاق می افتد؟","آیا گندم در جلو تیغه برش جمع شده و باعث ریزش خوشه در دستگاه برش می شود؟","آیا طول محصول بریده شده یکنواخت نبوده و ساقه ها پاره شده اند؟","آیا علف های هرز و سنبله ها دور چرخ فلک می پیچند؟","آیا ساقه توسط چرخ فلک حمل می شود؟","آیا عمل برش ضعیف انجام می شود؟","آیا محصولات خوابیده یا کج، خوب برداشت نمی شود؟ ","آیا آشغال و مواد زاید در نوک مقسم های واحد برش جمع می شود؟ ","آیا دستگاه برش خیلی آهسته بالا می رود؟  ","آیا چرخ فلک در حال بازایستادن از حرکت است؟ ","آیا کلاچ دستگاه برش درگیر نمی شود؟ ","آیا تغذیه دستگاه غیر یکنواخت است؟ ","آیا هلیس اصلی می خواهد از حرکت باز ایستد یا گیر کند؟","آیا محصول به دور سرشافت پروانه جمع می شود؟","آیا محصول به دور لوله انگشتی های چرخ فلک جمع می شود؟ ","آیا در پایین ترین وضعیت انگشتی های چرخ فلک به تیغه گیر می کند؟","آیا سنگ زیاد همراه محصول برداشته می شود؟ ","آیا سنگ ها و سایر مواد خارجی موجب خرابی قطعات کوبنده می شوند؟ "};
    String[] a1 = new String[]{"سرعت چرخ فلک جلو را کاهش دهید تا با سرعت حرکت کمباین تطبیق نماید. ","چرخ فلک را ضمن اینکه کاملاً به پایین می آورید به طرف جلو ببرید؛ به طوری که محصول بریده شده بیرون نریخته و به طرف حلزون بالابر هدایت شود. ارتفاع شانه برش را کاهش دهید به طوری که طول محصول بریده شده برای هدایت به هلیس مناسب باشد.","تمام قسمت های آسیب دیده انگشتی و تیغه ها را تعویض نمایید تا محصول یکنواخت بریده شود تیغه های خم شده را صاف کند. انگشتی و تیغه را دوباره آزمایش و در صورت لزوم تنظیم نمایید. گره ها را طوری تنظیم کنید که ضمن این که تیغه به آسانی حرکت می کند جای بازی زیادی نداشته باشد.  ","چرخ فلک را کاملاً به طرف جلو برده به پایین بیاورید. سرعت چرخ فلک جلو را کاهش دهید.","ضمن کاهش سرعت چرخ فلک، تطبیق سرعت آن با سرعت حرکت کمباین را بررسی کنید. چنگک ها را در انواع انگشتی دار به طور عمودی تنظیم کنید.","نگاهدارنده تیغه ها را دوباره تنظیم کنید. تیغه را تمیز کنید. میله های انگشتی را در حالت مستقیم تر قرار دهید. تیغه های خراب را تعویض نمایید. مواد زاید و خارجی و آشغال های جمع شده را، جمع آوری و پاک نمایید. ","فاصله بین میله های بلند کننده های دانه را تنظیم نمایید. انگشتی های پروانه را در حالت مورب قرار دهید. محصول را از جهت دیگر برداشت نمایید. فنرهای شناور را تنظیم کنید. پروانه را مقداری به سمت جلو تنظیم کنید. ","به وسیله ی تنظیم کشویی مقسم ها را در حالت بالاتری تنظیم کنید. از مقسم های مخصوص استفاده کنید. چنانچه لازم شد محافظ یا سینی زیر دستگاه برش را تعویض نمایید. ","تسمه پمپ هیدرولیک را تنظیم کنیم. روغن هیدرولیک را اندازه گیری و در صورت نیاز مخزن را باید بمقدار مورد لزوم پر کنید. فشار روغن هیدرولیک را کنترل کنید","کشش کلاچ لغزنده را تنظیم کنید. سطوح کشویی پولی های تغییر دهنده دور را روغنکاری کنید. دقت کنید بیش از اندازه روغن کاری نکنید. (تسمه V شکل نباید روغنکاری و گریس کاری شود). کابل کنترل دور چرخ فلک را عوض کنید.","تنظیم تسمه کلاچ و پولی های کلاچ دستگاه برش را کنترل کنید","با توجه به وضعیت محصول و متناسب با آن نسبت به تنظیم ارتفاع هلیس اصلی نیز اقدام کنید. وضعیت و حالت انگشتی های پروانه و دور آن را تنظیم نمایید. نسبت به وضعیت محصولات، پروانه را عمودی تر تنظیم نمایید. زنجیر استوانه خوراک دهند یا زنجیر کلش کش را تنظیم کنید. نگهدارنده یا ضامن محفظه خوراک دهنده را نسبت به وضعیت صحیح خود تنظیم نمایید. ","مارپیچ را به وسیله پره ها به عقب برگردانید و مواد را بیرون آورید. کلاچ لغزنده مربوطه را در وضعیت صحیح خود تنظیم نمایید.","برگردان های داخلی را به مرکز دستگاه برش نزدیک تر نمایید و در صورت امکان کمی بالاتر ببرید","چرخ فلک را بالا ببرید. انگشتی های چرخ فلک را کمی بیشتر به جلو خم کنید. دور پروانه را با سرعت حرکت کمباین هماهنگ نمایید.","چرخ فلک را بلند کنید. در صورت امکان به وسیله پیچ رگلاژ جک چرخ فلک را بلند کنید.","تعداد بلندکننده های محصول را کاهش دهید. از برداشت محصولات غیر ضروری و خیلی کوتاه خودداری کنید. محصولات خمیده و خوابیده باید به وسیله ی بلندکننده ها، بلند شود) ","سنگ گیر را زود به زود تمیز کنید. در زمین های سنگلاخ محصولات کم ارتفاع و غیرضروی را برداشت نکنید."};

    String[] q2 = new String[]{"آیا محصول به صورت نامنظم وارد سیلندر کوبنده می شود؟","آیا سیلندر کوبنده غیرمنظم کار کرده و بار زیاد وارد می شود؟ ","آیا دور کوبنده کم و زیاد می شود یا نامنظم است؟ ","آیا تسمه بیش از اندازه تاب خورده یا ساییده شده است؟ ","آیا کوبنده خوب کار نمی کند؟ ","آیا شکستگی دانه در کوبنده اتفاق می افتد؟","آیا دانه از پوست جدا نمی شود؟  ","آیا کزل دانه های جدا نشده در خوشه وجود دارد؟"};
    String[] a2 = new String[]{"ارتفاع چرخ فلک جلو و کشیدگی زنجیر دستگاه هدایت کلش را تصحیح نمایید","تسمه انتقال دهنده نیرو را تنظیم کنید تا از بکسوات آن جلوگیری شود. سرعت حرکت کوبنده را کاهش دهید. فاصله کوبنده و ضد کوبنده را طوری تنظیم کنید که دانه ها به طور کامل از خوشه جدا شود. دور موتور کمباین توسط متخصص مربوطه تنظیم شود. به کمک واحد مربوطه دور سیلندر کوبنده را اصلاح کنید","پولی و فنر سیلندر را که کشش تسمه انتقال نیرو را کنترل می کند دوباره تنظیم کنید. موتور را چک کنید. ","آشغال و مواد زاید را از پولی پاک نمایید مخصوصاً از پولی تغییر دور. سطوح لغزنده پولی های تغییر دور را تمیز و گریس کاری نمایید. در صورتی که تسمه ها روغنی شدند با محلول صابون بشویید. دستگاه های مختلف کمباین را در دور کم موتور به حرکت درآورید و سپس موتور را به حداکثر دور برسانید. کشش تسمه را کنترل کنید و در صورت لزوم محکم کنید.","فاصله بین کوبنده و ضد کوبنده را کمتر کنید. دور یا سرعت سیلندر را زیادتر کنید. تنظیمات اولیه یا ضد کوبنده را انجام دهید (اگر لازم باشد).  قطعات تاب خورده کوبنده را تعمیر یا تعویض کنید. فاصله بین کوبنده و ضد کوبنده را در قسمت ورودی و خروجی تنظیم کنید. در صورت نیاز، از قطعات و یا تجهیزات مخصوص خرمنکوب استفاده کنید. اگر لازم شد صفحات مقعر شکل کوبنده را درگیر کنید. ","دور استوانه یا سیلندر را کاهش دهید.  فاصله بین سیلندر و نیم سیلندر را افزایش دهید . دور سیلندر را برای محصولات معین کاهش دهی ، البته با استفاده از تجهیزات اختیاری (زنجیر). صفحات مقعر شکل را خلاص کنید. سوراخ های الک ها را بازتر کنید و از الک هایی که دارای سوراخ های سایز بزرگتر هستند استفاده کنید. کشش زنجیر و بالابر را تنظیم کنید.","دور کوبنده را افزایش دهید. فاصله بین ضد کوبنده و کوبنده را کمتر کنید. منتظر باشید تا محصول خوب رسیده و آماده برداشت شود. تنظیمات اولیه ذکر شده در مورد ضد کوبنده را کنترل و در صورت لزوم مجدداً آن را تنظیم کنید.","مقدار رطوبت محصول را آزمایش کنید. محصول باید کاملاً رسیده باشد. دور سیلندر کوبنده را افزایش دهید؛ به طوری که ضمن جدا کردن کامل دانه، موجب خرد شدن آن نشود. سرعت حرکت کمباین را افزایش دهید. فاصله را کاهش دهید تا قدرت کوبیدن افزایش پیدا کند. شانه برش را آزمایش کنید که عیب و نقص فنی نداشته باشد."};

    String[] q3 = new String[]{"آیا در الک افت دانه وجود دارد؟ ","آیا کلش به طور منظم از کمباین خارج نشده و جلو کاه برها جمع می شود؟ ","آیا در کاه برها افت دانه وجود دارد؟ "," آیا کاه برها گیر کرده یا افت دور پیدا کرده است؟","آیا تغذیه الک ها غیر یکنواخت است؟","آیا سینی الک می کوبد؟ ","آیا مواد زیادی در الک ها جمع می شود؟ ","آیا در الک ها همراه دانه پوسته و آشغال وجود دارد؟ ","آیا مقدار کاه و پوشال یا کاه ریزه در برگشتی ها زیاد است؟","آیا تعداد دانه ها در برگشتی ها زیاد است؟","آیا مقدار مواد زائد و سبز در برگشتی ها زیاد است؟","آیا بالابر مسدود شده (چراغ افت دور مربوط به پاک کننده و بالابر برگشتی ها روشن می شود)؟"};
    String[] a3 = new String[]{"مقدار باد را بیشتر کرده و روزنه الک ها را بیشتر باز کنید. دور بادبزن را کاهش داده و دریچه های باد را تنظیم کنید. روزنه الک بالایی را بازتر کرده و فاصله کوبنده و ضد کوبنده را کمتر کنید.  ","کشش تسمه ای منتقل کننده نیرو به شافت مربوط به کاه برها را کنترل نماید. سرعت حرکت شافت اصلی را افزایش دهید.","سرعت حرکت را کم کرده و طول کاه برها را افزایش دهید. سفره جلوی کاه برهای مایل را ببندید. سطح رویی کاه برها را کاملاً تمیز کنید.  ","دور شافت کاه برها را تنظیم کنید. کشش تسمه انتقال حرکت یا نیرو به کاه برها را تنظیم کنید. کاه برها یا شانه های آنها را از موادی که جمع شده تمیز کنید","کف سینی دانه و محصول را تمیز کنید. سیم های قسمت محفظه آماده سازی محصول که ممکن است کج شده باشند، را راست کنید.","گرد و خاک و آشغال جمع شده را از محفظه پنکه پاک کنید. تمام پیچ و مهره های نگهدارنده سینی الک را دوباره محکم کنید. اجزایی که الک ها را نگهداری می کنند خوب محکم کنید. یاتاقان ها و بلبرینگ های سینی را تعویض کنید","دور سیلندر را کاهش دهید. فاصله بین کوبنده و ضد کوبنده را بیشتر کنید. فاصله کوبنده و ضد کوبنده را در انتها بیشتر کنید. شکاف یا فاصله منافذ الک ها را تنظیم کنید. جریان باد را بیشتر کنید. جهت وزش باد را درست تنظیم کنید. ","جریان وزش باد را افزایش دهید. جهت وزش باد را درست تنظیم کنید. سوراخ های الک ها را تنگ تر انتخاب کنید. از الک های مسطح با سوراخ های کوچکتر استفاده کنید. کشش تسمه انتقال دور دستگاه را کنترل و در صورت نیاز تنظیم نمایید","جریان وزش باد را افزایش دهید. دهانه الک ها را جمع تر کنید. دور استوانه را کاهش دهید. در صورت امکان فاصله عقب ضد کوبنده را تغییر دهید. به وسیله ی تنظیم کش تسمه انتقال دور ، دور لازم را کنترل کنید.","الک های مسطح را تمیز کنید یا از الک های سوراخ پهن تر استفاده کنید. سوراخ های الک ها را بازتر کنید. ","دستگاه برش را تا حد امکان بالا ببرید، بلند کننده های دانه باید محصول را از مواد زائد و سبز جدا سازید. دهانه عقب الک را کمی تنگتر کنید.","دریچه کف بالابر را باز کنید و مواد و اجسام را پاک کرده، همچنین قسمت گلویی هلیس را باز نمایید. کمباین را با باز بودن دریچه به حرکت درآورید تا بالابر و هلیس کاملاً تمیز شوند. امکان دارد مشکل با تنظیم و کشش زنجیر الواتور رفع شود. سعی کنید از تجمع زیاد مواد و برگشتنی بیش از اندازه مواد جلوگیری کنید. تسمه ای که بالابرها را به حرکت در می آورد تنظیم کنید."};

    String[] q4 = new String[]{"در مخزن، مقدار دانه های خرد و شکسته بیشتر از حد معمولی به چشم می خورد؟ ","آیا در مخزن دانه مواد خارجی و خار وجود دارد؟ ","آیا مقدار کاه موجود در مخزن زیاد است؟ ","آیا در مخزن مقدار دانه های خرد و شکسته بیشتر از حد معمول است؟ ","آیا تخلیه مخزن دانه خوب انجام نمی شود یا از کار افتاده است؟ "};
    String[] a4 = new String[]{"سرعت دور سیلندر کوبنده را کاهش دهید. یا فاصله کوبنده و ضد کوبنده را افزایش دهید. ","دور دمنده را زیاد کنید. با دریچه های مربوطه جهت وزش باد را درست تنظیم کنید. منافذ الک ها را کمی ببندید. فاصله سیلندر کوبنده و زیر سیلندر کوبنده را بیشتر نمایید و دور سیلندر کوبنده را کاهش دهید. نوسان الک ها را چک کنید.","دنباله الک بالایی را طوری قرار دهید که از شیب آن کاسته شود و روزنه های الک را کمی ببندید. دور بادبزن را افزایش دهید. فاصله کوبنده و ضد کوبنده را کاهش داده و یا دور سیلندر کوبنده را کم کنید.  ","روزنه های الک بالایی و پایینی را بیشتر باز نمایید. سرعت حرکت کمباین را زیاد نمایید. فاصله سیلندر و ضدکوبنده را تنظیم کنید","کشش تسمه (V) را تنظیم کنید. کشش تسمه اصلی و تسمه انتقال نیرو به هلیس های تخلیه مخزن دانه را دوباره تنظیم کنید. مهره چرخ دنده مخصوص هلیس تخلیه مخزن دانه را عوض کنید. پره های اشتباه خم داده شده هلیس را دوباره به دقت خم کنید. کشش زنجیر انتقال نیروی هلیس تخلیه را در آخر لوله تخلیه تنظیم کنید."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);


        ViewGroup viewGroup = (RelativeLayout) findViewById(R.id.container);
        root = TreeNode.root();

        buildTree();
        TreeView treeView = new TreeView(root, this, new MyNodeViewFactory());
        View view = treeView.getView();
        view.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        viewGroup.addView(view);

    }

    private void buildTree() {
        for (int i = 0; i < t.length; i++) {

            TreeNode treeD;
            treeD = new TreeNode(t[i]);
            treeD.setLevel(99);
            if(i==0) {

                for (int j = 0; j < q1.length; j++) {
                    TreeNode tree;
                    tree = new TreeNode(q1[j]);
                    tree.setLevel(100);

                    TreeNode tree1;
                    tree1 = new TreeNode(a1[j]);
                    tree1.setLevel(101);

                    tree.addChild(tree1);

                    treeD.addChild(tree);
                }
            }else if (i==1){
                for (int j = 0; j < q2.length; j++) {
                    TreeNode tree;
                    tree = new TreeNode(q2[j]);
                    tree.setLevel(100);

                    TreeNode tree1;
                    tree1 = new TreeNode(a2[j]);
                    tree1.setLevel(101);

                    tree.addChild(tree1);

                    treeD.addChild(tree);
                }
            }else if (i==2){
                for (int j = 0; j < q3.length; j++) {
                    TreeNode tree;
                    tree = new TreeNode(q3[j]);
                    tree.setLevel(100);

                    TreeNode tree1;
                    tree1 = new TreeNode(a3[j]);
                    tree1.setLevel(101);

                    tree.addChild(tree1);

                    treeD.addChild(tree);
                }
            }else {
                for (int j = 0; j < q4.length; j++) {
                    TreeNode tree;
                    tree = new TreeNode(q4[j]);
                    tree.setLevel(100);

                    TreeNode tree1;
                    tree1 = new TreeNode(a4[j]);
                    tree1.setLevel(101);

                    tree.addChild(tree1);

                    treeD.addChild(tree);
                }
            }

            root.addChild(treeD);

        }


    }

}
