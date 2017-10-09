package com.lyrics.banglafolksongs;

import android.widget.ArrayAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> abdulAlim = new ArrayList<String>();
        abdulAlim.add("বহু দিনের পিরিত গো বন্ধু");
        abdulAlim.add("হলুদিয়া পাখি, সোনারই বরণ");
        abdulAlim.add("দুয়ারে আইসাছে পালকি");
        abdulAlim.add("অসময় বাঁশি বাজায় কেরে");


        List<String> akkasDewan = new ArrayList<String>();
        akkasDewan.add("মধুর মধুর কথা কইয়া চিত্তে দাগা দিল");



        List<String> amirUddin = new ArrayList<String>();
        amirUddin.add("লোকে বলে আমার ঘরে নাকি চাঁদ উঠেছে");
        amirUddin.add("হেলায়, হেলায় কার্য নষ্ট");
        amirUddin.add("শিখাইয়া পিরিতি করিলো ডাকাতি");

        List<String> askorAli = new ArrayList<String>();
        askorAli.add("কি জ্বালা দিয়া গেলা মোরে");

        List<String> bariSiddiki = new ArrayList<String>();
        bariSiddiki.add("আমি একটা জিন্দা লাশ");
        bariSiddiki.add("রজনী হইসনা অবসান");
        bariSiddiki.add("শুয়া চান পাখি আমার");

        List<String> bijoySarkar = new ArrayList<String>();
        bijoySarkar.add("তুমি জান না তুমি জান না রে প্রিয়");
        bijoySarkar.add("জানিতে চাই দয়াল তোমার আসল নামটা কি");

        List<String> durbinShah = new ArrayList<String>();
        durbinShah.add("নামাজ আমার হইল না আদায়");
        durbinShah.add("তুই যদি হইতি গলার মালা");
        durbinShah.add("নির্জন যমুনার কূলে");
        durbinShah.add("বন্ধু যদি হইতো নদীর জল");

        List<String> hasonRaja = new ArrayList<String>();
        hasonRaja.add("মাটিরও পিঞ্জিরার মাঝে বন্দী হইয়া রে");
        hasonRaja.add("লোকে বলে বলেরে");
        hasonRaja.add("নিশা লাগিল রে");

        List<String> jalalUddin = new ArrayList<String>();
        jalalUddin.add("আমায় এত দুঃখ দিলি বন্ধুরে বন্ধু");


        List<String> jashimUddin = new ArrayList<String>();
        jashimUddin.add("আমায় এত রাতে ক্যানে ডাক দিলি");
        jashimUddin.add("আমার হার কালা করলাম রে");
        jashimUddin.add("রঙিলা রঙিলা রঙিলা রে রঙিলা");
        jashimUddin.add("আগে জানি না রে দয়াল তোর পীড়িতে পরাণ যাবে");

        List<String> kamalPasha = new ArrayList<String>();
        kamalPasha.add("দ্বীন দুনিয়ার মালিক খোদা");

        List<String> lalonShaah = new ArrayList<String>();
        lalonShaah.add("আমার ঘরের চাবি পরের হাতে");

        List<String> lokoGeeti = new ArrayList<String>();
        lokoGeeti.add("মাঝি বাইয়া যাও রে।");
        lokoGeeti.add("পরের জায়গা পরের জমিন");


        List<String> monirSorkar = new ArrayList<String>();
        monirSorkar.add("একদিন মাটির ভিতরে হবে ঘর");

        List<String> moniruZzaman = new ArrayList<String>();
        moniruZzaman.add("আমার মন তো বসে না গৃহ কাজে");

        List<String> mujibPardeshi = new ArrayList<String>();
        mujibPardeshi.add("আমার সোনা বন্ধুরে, তুমি কোথায় রইলারে");
        mujibPardeshi.add("আমি কেমন করে পত্র লিখি গো বন্ধু");

        List<String> poranFakir = new ArrayList<String>();
        poranFakir.add("তুমি কোনবা দেশে রইলা রে দয়াল চাঁদ");

        List<String> radhaRaman = new ArrayList<String>();
        radhaRaman.add("শ্যাম কালিয়া সোনা বন্ধু রে");
        radhaRaman.add("কারে দেখাবো মনের দুঃখ গো আমি বুক চিরিয়া ");
        radhaRaman.add("মনে নাই গো আমারে বন্ধুয়ার মনে নাই");
        radhaRaman.add("ভ্রমর কইয়ো গিয়া");
        radhaRaman.add("আমার বন্ধু দয়াময়");
        radhaRaman.add("পিরিতি বিষম জ্বালা");

        List<String> shachinDebBurman = new ArrayList<String>();
        shachinDebBurman.add("কে যাস রে ভাটি গাঙ বাইয়া");

        List<String> shahAbdulkarim = new ArrayList<String>();
        shahAbdulkarim.add("কেন পিড়িতি বাড়াইলা রে বন্ধু");
        shahAbdulkarim.add("মন মজালে ওরে বাউলা গান");
        shahAbdulkarim.add("প্রাণে আর সহেনা দারুন জ্বালা");

        //abdulAlim.add("মন মজালে ওরে বাউলা গান");

        List<String> vobaPagla = new ArrayList<String>();
        vobaPagla.add("বারে বারে আর আসা হবে না");
        vobaPagla.add("নদী ভরা ঢেউ বোঝ নাতো কেউ");


        expandableListDetail.put("জসীম উদ্দিন", jashimUddin);
        expandableListDetail.put("পল্লীগীতি", lokoGeeti);
        expandableListDetail.put("বিজয় সরকার ", bijoySarkar);
        expandableListDetail.put("শাহ আব্দুল করিম",shahAbdulkarim);
        expandableListDetail.put("আস্কর আলী",askorAli);
        expandableListDetail.put("মুজিব পরদেশী",mujibPardeshi);
        expandableListDetail.put("আব্দুল আলীম",abdulAlim);
        expandableListDetail.put("রাধারমণ দত্ত",radhaRaman);
        expandableListDetail.put("বারী সিদ্দিকী",bariSiddiki);
        expandableListDetail.put("কামাল পাশা", kamalPasha);
        expandableListDetail.put("হাছন রাজা", hasonRaja);
        expandableListDetail.put("ভবা পাগলা",vobaPagla);
        expandableListDetail.put("পরান ফকির",poranFakir);
        expandableListDetail.put("জালাল উদ্দীন",jalalUddin);
        expandableListDetail.put("আমির উদ্দিন",amirUddin);
        expandableListDetail.put("মুনীর সরকার", monirSorkar);
        expandableListDetail.put("আক্কাস দেওয়ান",akkasDewan);
        expandableListDetail.put("দুরবীন শাহ্",durbinShah);
        expandableListDetail.put("লালন শাহ", lalonShaah);
        expandableListDetail.put("মনিরুজ্জামান মনির / মাসুদ করিম",moniruZzaman);
        expandableListDetail.put("শচীন দেব বর্মণ", shachinDebBurman);




        return expandableListDetail;
    }
    public static HashMap<String, String> getAllLyrics(){
        HashMap<String, String> allLyrics = new LinkedHashMap<String, String>();

        allLyrics.put("কে যাস রে ভাটি গাঙ বাইয়া", TextFile.keJashReVatirGangbaiya());
        allLyrics.put("আমার মন তো বসে না গৃহ কাজে", TextFile.amarMonToBoseNaGrihoKaje());
        allLyrics.put("আগে জানি না রে দয়াল তোর পীড়িতে পরাণ যাবে", TextFile.ageJaninaReDoyalTorPiritePoranJabe());
        allLyrics.put("অসময় বাঁশি বাজায় কেরে", TextFile.osomoyBashiBajayKeRe());
        allLyrics.put("বন্ধু যদি হইতো নদীর জল", TextFile.bondhuJodiHoitoNodirJol());
        allLyrics.put("পিরিতি বিষম জ্বালা", TextFile.kulNilogoShamerBasi());
        allLyrics.put("তুই যদি হইতি গলার মালা", TextFile.tuiJodiHoitiGolarMala());
        allLyrics.put("নির্জন যমুনার কূলে", TextFile.nirjonJomunarKule());
        allLyrics.put("নামাজ আমার হইল না আদায়", TextFile.namajAmarHoiloNaAday());
        allLyrics.put("আমার ঘরের চাবি পরের হাতে", TextFile.amarGhorerChabiPorerHate());
        allLyrics.put("নিশা লাগিল রে" , TextFile.nishaLagiloReBakaDuiNoyoneNishaLagiloRe());
        allLyrics.put("লোকে বলে বলেরে" , TextFile.lokeBoleBolereGhorbariValaNaAmar());
        allLyrics.put("আমায় এত রাতে ক্যানে ডাক দিলি",         TextFile.amayEtoRateKenoDakDili());
        allLyrics.put("আমার হার কালা করলাম রে",              TextFile.amarHarKalaKorlamRe());
        allLyrics.put("রঙিলা রঙিলা রঙিলা রে রঙিলা",            TextFile.rongilaRongilaRongila());
        allLyrics.put("মাঝি বাইয়া যাও রে।",                    TextFile.majhiBaiyaJaoRe());
        allLyrics.put("তুমি জান না তুমি জান না রে প্রিয়",        TextFile.tumiJanoNaRePriyo());
        allLyrics.put("কেন পিড়িতি বাড়াইলা রে বন্ধু",            TextFile.kenoPiritiBarailareBondhu());
        allLyrics.put("কি জ্বালা দিয়া গেলা মোরে",               TextFile.kiJalaDiyaGelaMore());
        allLyrics.put("আমার সোনা বন্ধুরে, তুমি কোথায় রইলারে",   TextFile.amarSonaBondhuRe());
        allLyrics.put("আমি কেমন করে পত্র লিখি গো বন্ধু",       TextFile.amiKemonKorePoroLikhi());
        allLyrics.put("বহু দিনের পিরিত গো বন্ধু",               TextFile.bohuDinerPiritGoBondhu());
        allLyrics.put("হলুদিয়া পাখি, সোনারই বরণ",               TextFile.holudiyaPakhiSonariBoron());
        allLyrics.put("দুয়ারে আইসাছে পালকি",                   TextFile.duareAisachePalki());
        allLyrics.put("পরের জায়গা পরের জমিন",                   TextFile.porerJagaPorerJomi());
        allLyrics.put("শ্যাম কালিয়া সোনা বন্ধু রে",              TextFile.shayamKaliaSonaBondhure());
        allLyrics.put("কারে দেখাবো মনের দুঃখ গো আমি বুক চিরিয়া ", TextFile.kareDekhaboMonerDukkhogo());
        allLyrics.put("মনে নাই গো আমারে বন্ধুয়ার মনে নাই",      TextFile.moneNaiGoAmareBondhuarMoneNai());
        allLyrics.put("ভ্রমর কইয়ো গিয়া",                      TextFile.vromorKoioGiya());
        allLyrics.put("জানিতে চাই দয়াল তোমার আসল নামটা কি",     TextFile.janiteChaiDoyalTomarAsolNamtiKi());
        allLyrics.put("মন মজালে ওরে বাউলা গান", TextFile.monMojaleOreBaulaGaan());
        allLyrics.put("আমি একটা জিন্দা লাশ", TextFile.amiEktaZindaLash());
        allLyrics.put("রজনী হইসনা অবসান", TextFile.rojoniHoisnaOboshan());
        allLyrics.put("শুয়া চান পাখি আমার", TextFile.suaChandPakhi());
        allLyrics.put("দ্বীন দুনিয়ার মালিক খোদা",TextFile.dinDuniyarMalikKhoda());
        allLyrics.put("মাটিরও পিঞ্জিরার মাঝে বন্দী হইয়া রে" , TextFile.matirOPinjirarMajheBondiHoiyaRe());
        allLyrics.put("আমায় এত দুঃখ দিলি বন্ধুরে বন্ধু",TextFile.amayEtoDukkhoDiliBondhure());
        allLyrics.put("বারে বারে আর আসা হবে না",TextFile.bareBareArAsaHobeNa());
        allLyrics.put("নদী ভরা ঢেউ বোঝ নাতো কেউ", TextFile.nodiVoraDheuBojheNaToKeu());
        allLyrics.put("হেলায়, হেলায় কার্য নষ্ট", TextFile.helayHelayKarjoNosto());
        allLyrics.put("শিখাইয়া পিরিতি করিলো ডাকাতি",TextFile.sikhaiyaPiritiKoriloDakati());
        allLyrics.put("আমার বন্ধু দয়াময়", TextFile.amarBondhuDoyamoy());
        allLyrics.put("একদিন মাটির ভিতরে হবে ঘর", TextFile.ekdinMatirVitoreHobeGhor());
        allLyrics.put("মধুর মধুর কথা কইয়া চিত্তে দাগা দিল",TextFile.modhurModhurKothaKoiya());
        allLyrics.put("প্রাণে আর সহেনা দারুন জ্বালা", TextFile.praneArSohenaDarunJala());


        return allLyrics;
    }
}
