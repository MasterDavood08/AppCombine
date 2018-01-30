package com.example.master.appcombine;

import android.os.Bundle;
import android.widget.TextView;

public class ResourceActivity extends BaseActivity {
String text ="توسلي ، ا. و س . مينائي . 1381. بررسي تلفات انتهاي كمباين جاندير و تاثير سرعت پيشروي برآن. خلاصه مقالات دومين كنگره ملي مهندسي ماشين هاي كشاورزي ومكانيزاسيون ، 8 و9 آبان ، كرج  : 64- 61.\n" +
        "ده\u200Dق\u200Dان\u200C، الیاس. 1388. ب\u200Dررسی\u200C م\u200Dی\u200Dزان\u200C و دلایل\u200C ت\u200Dل\u200Dف\u200Dات\u200C دان\u200Dه\u200C در ک\u200Dم\u200Dب\u200Dاین ه\u200Dای\u200C ب\u200Dرداش\u200Dت\u200C گ\u200Dن\u200Dدم\u200C در اس\u200Dت\u200Dان\u200C خ\u200Dوزس\u200Dت\u200Dان. گزارش نهائی. ش\u200Dم\u200Dاره\u200C ث\u200Dب\u200Dت\u200C ۸۸/۹۴۷.\n" +
        "مستوفی سرکاری، م. ر. 1386. ارزيابي مزرعه اي دستگاه نمايشگر افت دانه در شرايط متفاوت برداشت روي كمباين 955 JD. گزارش نهایی. شماره ثبت 1308/86 .\n" +
        "مستوفی سرکاری، م. ر. 1388. ارزيابي و مقايسه فني- اقتصادي عملكرد كمباين هاي جديد گندم با كمباينهاي رايج به منظور اصلاح و  بهينه سازي آنها (طرح ملی). گزارش نهایی. شماره ثبت 40669.\n" +
        "مستوفی سرکاری، م. ر.، ولیعهدی، م. س. و رنجبر، ا. 1393. ارزیابی مزرعه اي تلفات انتهاي کمباین غلات مجهز به دستگاه نمایشگر تلفات دانه در کمباین هاي 955 JD- و 1165 JD. نشریه ماشین های کشاورزی. دانشگاه فردوسی مشهد. جلد 4 شماره 2. صفحات 335-343.\n" +
        "مستوفی سرکاری، م، ب، ناصحی، ج، ساعی، س، فرهمند، م، رئوفی، م، قماشی و ا، ولائی. 1385. اندازه گیری افت کمباینی در زراعت گندم آبی و دیم در هفت استان کشور در سال زراعی 83-84. وزارت جهاد کشاورزی- دفتر مجری طرح گندم و موسسه تحقیقات فنی و مهندسی کشاورزی\n" +
        "منصوري ، ح . و س. مينائي . 1382 . بررسي تاثير پارامترهاي ماشين بر تلفات گندم در كمباين جاندير . مجموعه خلاصه مقالات نخستين همايش ملي بررسي ضايعات محصولات كشاورزي، 29 مهرماه دانشكده كشاورزي دانشگاه تربيت مدرس . تهران : 94- 92 .\n" +
        "منصوری راد، د. 1377. تراکتورها و ماشین های کشاورزی. جلد دوم. انتشارات دانشگاه بوعلی سینا همدان. \n" +
        "Mostofi Sarkari, M.R. 2010. Field Evaluation of Grain Loss Monitoring on Combine JD 955. Advances in Environmental Biology. Vol 2, No. 4, PP. 162-167.\n" +
        "Mostofi Sarkari, M.R., Shaker, M. & Mahdinia, A., 2011. Investigation and Technical Comparison of New and Conventional Wheat Combines Performance for Improvement and Modification. CIGR Journal. No. 3, 2011. \n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource);
        TextView textView = (TextView) findViewById(R.id.tv);
        textView.setText(text);
    }
}
