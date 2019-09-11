package com.ieee.ieee04;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;


public class Kulupler2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kulupler2);
        Bundle extras= getIntent().getExtras();
        String kulup=extras.getString("kulup");
     //   Toast.makeText(this, kulup, Toast.LENGTH_SHORT).show();
        TextView textView=findViewById(R.id.textView);
        textView.setMovementMethod(new ScrollingMovementMethod());
        ImageView image = findViewById(R.id.imageView);
        Log.d("kulup",kulup);
        if(kulup.equals("cs")){
            textView.setText(
                    "Bilişim teknolojilerine meraklı üyelerin katılımıyla oluşan IEEE KOU \n" +
                    "Computer Society’nin temel amacı, üyelerin projeler üzerinden bilgisayar ve bilgi \n" +
                    "işleme teknolojisine dayalı yeteneklerini geliştirmesine imkan sağlayacak ortam \n" +
                    "yaratmaktır.\n" +
                    "Odağında farklı programlama dillerinde uygulama ve algoritma geliştirme \n" +
                    "bulunan komite, projelerin geliştirilmesine katkıda bulunmanın yanısıra üyelerin \n" +
                    "ihtiyaç duyduğu mentörlük, eğitim ve tartışma ortamını sağlamak amacıyla \n" +
                    "birçok faaliyette bulunmaktadır. \n" +
                    "Başkanı Mehmet Ali Çakır’dır");
            image.setImageResource(R.drawable.cs35);
        }
        else if (kulup.equals("pes")){
            textView.setText("IEEE KOU PES komitesi, IEEE’nin en eski topluluklarından biri olup okulumuzda aktif \n" +
                    "olarak görev\n" +
                    "yapmaktadır. Vizyon ve misyon olarak güç ve enerji alanına meraklı, bu alanda bir şeyler \n" +
                    "öğrenmek,\n" +
                    "başarmak ve mühendislik geliştirmek isteyen insanları bir araya getirmek amacı ile \n" +
                    "oluşturulmuş birtopluluktur. Genç neslin meraklıları ile alanında uzman, sektör ve bu alandaki gelişmeler \n" +
                    "hakkında\n" +
                    "bilgi sahibi insanları bir araya getirerek çeşitli eğitim, workshop, projeler ve salon \n" +
                    "etkinlikleri\n" +
                    "gerçekleştirmektedir. Düzenlenen teknik geziler ile sektörü yerinde görme imkanı \n" +
                    "sağlarken, PES Talks  adlı etkinlikte alanında uzman kişileri üyelerimiz ile \n" +
                    "birleştirmektedir.\n" +
                    "Başkanı Mert Esemen’dir");
            image.setImageResource(R.drawable.pes);
        }
        else if (kulup.equals("comsoc")){
            textView.setText("IEEE KOU Communications Society, haberleşme teknolojileri ile ilgilenen ve bu alanda \n" +
                    "kendilerini geliştirmeyi hedefleyen öğrencileri bir araya getiren öncü bir öğrenci \n" +
                    "topluluğudur. Üyelerine haberleşme sektörünü ve akademik faaliyetleri yakından tanıma \n" +
                    "ve takip etme, eğitimler ve projeler ile deneyim kazanma fırsatı sunar. Yıl içerisinde \n" +
                    "düzenlediği ComMeet gibi etkinlikler, Elektronik ve Haberleşme Paneli, seminerler ve \n" +
                    "eğitimler ile geleceğin mühendisleri ile haberleşme dünyası arasında köprü kurarak \n" +
                    "daha büyük bir bütünün parçası olmalarını, öğrencilerin haberleşme alanındaki son \n" +
                    "teknolojik gelişmeler hakkında bilgilenmesini ve bu alanda donanımlı bir hale gelmelerini \n" +
                    "sağlar.\n" +
                    "Başkanı Deniz Göktepe’dir.");
            image.setImageResource(R.drawable.comsoc5);
        }
        else if (kulup.equals("ras")){
            textView.setText("IEEE KOU Robotics and Automation Society(RAS) robotik, elektrik, \n" +
                    "elektronik, yazılım, mekatronik, otomasyon sektörlerindeki gelişmelere \n" +
                    "bağlı olarak çeşitli projelere imza atmayı hedefleyen, teoriyi uygulama \n" +
                    "becerisiyle pratiğe döken IEEE KOU’nun teknik komitelerinden birisidir.\n" +
                    "Robotik alanına ilgi duyan, programlama dili ve elektronik devrelere ilgisiolan arkadaşlarımızın severek çalışacağı hem üretip hem öğrenebileceği \n" +
                    "sektörün provasını yapan bir komitedir.\n" +
                    "Başkanı Yılmaz Bozoğlan’dır");
            image.setImageResource(R.drawable.ras5);
        }
        else if (kulup.equals("wie")){
            textView.setText("IEEE Women in Engineering Affinity Group (WiE); STEM (bilim, teknoloji, mühendislik ve \n" +
                    "matematik) dallarında kadınların ilerleme göstermesi ve sektördeki yerinin vurgulanması \n" +
                    "için kurulmuş en büyük uluslararası profesyonel organizasyondur. IEEE WiE’nin misyonu, \n" +
                    "teknik disiplinlerdeki kadınların kariyer alanında iş bulmalarını ve iş hayatlarındaki \n" +
                    "sürdürülebilirliklerini kolaylaştırmaktır. Bu doğrultuda kadınların ve erkeklerin \n" +
                    "farklılıklarının esas alınarak yeteneklerini kullanmaları ve dünyanın geleceğini beraber \n" +
                    "üretmeleri WiE’nin en büyük amacıdır.\n" +
                    "Başkanı Yiğit Aktosun’dur");
            image.setImageResource(R.drawable.wie5);
        }
        else if(kulup.equals("emb")){
            textView.setText("Engineering in Medicine and Biology Society (EMBS), fen bilimlerini temel alarak mühendislik \n" +
                    "uygulamalarından faydalanmayı amaçlayan ve gücünü IEEE’den alan en büyük biyomedikal \n" +
                    "topluluğudur. Dünyanın 97 ayrı ülkesinde sektördeki profesyonel bilim insanları ve öğrencilerden \n" +
                    "oluşan 12.000 üyesiyle, günümüzde ve gelecekte sağlık alanında ve bilimsel çalışmalarda \n" +
                    "kullanılacak teknolojinin geliştirilmesinde etkin rol almaktadır. Bunun yanı sıra, ülkemizde faaliyet \n" +
                    "gösteren 27 üniversitedeki aktif öğrenci kollarıyla çalışmalarını sürdürmektedir. Elektronik ve \n" +
                    "Haberleşme Mühendisliği, Kimya Mühendisliği, Makine Mühendisliği ve Bilgisayar Mühendisliği \n" +
                    "gibi farklı disiplinlerdeki bölümlerini içine alan ortak projeler geliştirmeyi, teknik gezileri, \n" +
                    "bölümlere özgü eğitimleri ve interaktif seminerleri düzenlemeyi planlıyoruz. \n" +
                    "Başkanı Fatma Düzyol’dur.");
            image.setImageResource(R.drawable.emb5);
        }
        else if(kulup.equals("eab")){
            textView.setText("IEEE KOU Educational Activities Komitesi kendimizi ve daha çok üniversite öncesi kitleyi \n" +
                    "mühendislik ve bilim  konusunda bilinçlendirmek adına gerçekleştirdiğimiz etkinlikler ve \n" +
                    "çevremizdeki sorunlara mühendislik bakış açısı ile çözümler ürettiğimiz bir platformdur. \n" +
                    "İlkokul, ortaokul ve lise öğrencileri ile yaptığımız tüm çalışmalar hem onlara hem de \n" +
                    "bizlere çok şey katmaktadır.\n" +
                    "Başkanı Canan Yılmaz’dır.");
            image.setImageResource(R.drawable.eab5);
        }
        else if(kulup.equals("aess")){
            textView.setText("AESS,IEEE teknik alt birimlerinden biridir.\n" +
                    "Temel amacı sizlere havacılık-uzay, avionik, uzay sistemleri, radar, sinyal işleme, uçuş similasyon sistemleri, havacılık elektroniği ve temel aerodinamik hakkında eğitimler, konferanslar ve etkinlikler düzenleyerek ayrıca mentörlük sağlayarak bilgiler vermektedir.\n" +
                    "Aynı zamanda amacı doğrultusunda AESS üyesi olarak yenilikçi projeler üretebilir ve bu projeleri geliştirmek için komitemizin sağladığı imkanlardan faydalanabilir, düzenlenen fikir yarışmaların ile fikirlerinizi hayata geçmesine olanak bulabilirsiniz.");
            image.setImageResource(R.drawable.aess);
        }

    }
}
