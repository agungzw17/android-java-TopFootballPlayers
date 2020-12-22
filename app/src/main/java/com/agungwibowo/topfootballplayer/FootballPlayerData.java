package com.agungwibowo.topfootballplayer;

import java.util.ArrayList;

public class FootballPlayerData {
    private static String[] FootballPlayerNames = {
        "Neymar",
        "Lionel Messi",
        "Robert Lewandowski",
        "Kylian Mbappe",
        "Jadon Sancho",
        "Kevin De Bruyne",
        "Cristiano Ronaldo",
        "Josip licic",
        "Ciro Immobile",
        "Adama Traore"
    };

    private static String[] FootballPlayerDescription = {
            "Neymar adalah salah satu pesepakbola yang sejak 3 Juni 2013 lalu bergabung bersama Barcelona. Neymar memulai karir sepakbolanya saat ia bergabung bersama klub junior Portuguesa Santista. Pada tahun 2003, putra dari mantan pesepakbola Neymar da Silva Sr ini bergabung ke akademi Santos yang juga pernah menghasilkan pesepakbola sukses seperti Coutinho, Clodoaldo, Diego, Elano and Alex.",
            "lahir di Rosario, Argentina, pada 24 Juni 1987. Pemain tim nasional Argentina bertinggi 169 cm itu saat ini bermain di La Liga bersama Barcelona. Di usianya yang masih 21 tahun, Messi dianggap sebagai salah satu talenta terbaik Argentina.",
            "Robert Lewandowski adalah seorang pemain sepak bola profesional yang berasal dari Polandia. Ia lahir pada tanggal 21 Agustus 1988 di Warsaw, Polandia. Saat ini ia merupakan salah satu punggawa dari klub Bayern Munchendan bermain pada penyerang. Selain itu ia juga termasuk pemain dalam skuad timnas Polandia.",
            "Kylian Mbappé Lottin (pengucapan bahasa Prancis: [kiljan (ə)mbape]; lahir 20 Desember 1998) adalah seorang pemain sepak bola profesional Prancis yang bermain sebagai penyerang untuk Paris Saint-Germain dan tim nasional Prancis.\n" +
                    "\n" +
                    "Mbappé sudah menonjol pada usia dini, ia menjadi bintang bagi akademi remaja di AS Bondy, INF Clairefontaine, dan Monaco, klub terakhir ini membuat debutnya sebagai seorang pemain profesional untuk tim cadangan. Mbappé segera menjadi starter reguler dan pencetak gol untuk tim pertama di musim 2016-17, membantu klub mendapatkan gelar pertama mereka di Ligue 1 di usia tujuh belas tahun. Musim berikutnya, ia bergabung dengan Paris Saint-Germain dengan kontrak pinjaman, dengan kesepakatan di tempat untuk dapat bergabung dengan klub secara permanen di akhir musim dengan biaya sekitar €180 juta",
            "adon Malik Sancho (lahir 25 Maret 2000) adalah pemain sepak bola profesional Inggris yang bermain sebagai pemain sayap untuk klub Bundesliga Borussia Dortmund dan tim nasional Inggris .\n" +
                    "\n" +
                    "Sebelumnya merupakan pemain muda bersama Watford dan Manchester City , Sancho menandatangani kontrak senior pertamanya dengan Dortmund pada 2017. Di musim keduanya, ia memantapkan dirinya sebagai pemain reguler tim utama dan dinobatkan sebagai Tim Bundesliga Musim 2018-19 . [5] Menjelang musim 2019-20, Sancho memenangkan trofi pertamanya setelah kemenangan DFL-Supercup atas Bayern Munich . [6]",
            "lahir di Drongen, Belgia, 28 Juni 1991; umur 28 tahun) adalah seorang pemain sepak bola asal Belgia yang bermain untuk Manchester City dan tim nasional Belgia. Ia dapat bermain pada posisi gelandang serang maupun gelandang sayap.",
            "Cristiano Ronaldo dos Santos Aveiro, OIH (Portugis: [kɾiʃˈtjɐnu ʁoˈnaɫdu] lahir di Funchal, Madeira, Portugal, 5 Februari 1985; umur 35 tahun) atau lebih dikenal Cristiano Ronaldo merupakan seorang pemain sepak bola Portugal. Ia dapat berposisi sebagai sayap kiri atau kanan serta penyerang tengah. Saat ini ia bermain untuk tim Italia, Juventus dan untuk tim nasional Portugal. Sebelum bermain untuk Real Madrid, ia pernah bermain di Sporting Lisboa dan Manchester United. Pemain yang kerap bernomor punggung 7 di lapangan hijau ini juga akrab dengan sebutan CR7, gabungan dari inisial nama dan nomor punggungnya.",
            "Josip Iličić [1](lahir di Prijedor, 29 Januari 1988; umur 32 tahun) adalah seorang pemain sepak bola berkewarganegaraan Slovenia yang bermain untuk klub Atalanta biasa bermain pada posisi bek.\n" +
                    "\n" +
                    "Iličić memulai karier juniornya di klub Triglav dan Britof kemudian memulai karier seniornya di klub Bonifika. Sempat pindah ke Interblock dan Maribor sebelum bergabung dengan Palermo pada tahun 2010.[2]",
            "Ciro Immobile (pengucapan bahasa Italia: [ˈtʃiro imˈmɔbile]) (lahir di Torre Annunziata, 20 Februari 1990; umur 30 tahun) adalah seorang pemain sepak bola berkewarganegaraan Italia yang bermain untuk klub Lazio biasa bermain pada posisi penyerang.\n" +
                    "\n" +
                    "Immobile memulai karier juniornya di klub Sorrento dan Juventus kemudian memulai karier seniornya di klub tersebut. Sempat dipinjamkan ke Siena, Grosseto[2] dan Pescara sebelum bergabung dengan Genoa pada tahun 2012.",
            "Adama Traore Diarra (lahir Januari 1996 25) adalah seorang profesional Spanyol pesepakbola yang bermain sebagai pemain sayap atau wing-back untuk Premier League klub Wolverhampton Wanderers .\n" +
                    "\n" +
                    "Dia memulai karirnya dengan Barcelona , tampil terutama untuk cadangan . Pada 2015 ia menandatangani kontrak dengan Aston Villa dan setahun kemudian Middlesbrough , sebelum bergabung dengan Wolverhampton Wanderers pada Agustus 2018.\n" +
                    "\n"
    };

    private static String[] FootballPlayerClub = {
            "Paris Saint-Germain",
            "Barcelona",
            "Bayern Munich",
            "Paris Saint-Germain",
            "Borussia Dortmund",
            "Manchester City",
            "Juventus",
            "Atalanta",
            "Lazio",
            "Wolverhampton Wanderers"
    };

    private static String[] FootballPlayerCountry = {
            "Brazil",
            "Argentina",
            "Polandia",
            "France",
            "English",
            "Belgia",
            "Portugal",
            "Slovenia",
            "Italia",
            "Spanyol"
    };

    private static Double[] FootballPlayerRating = {
            8.68,
            8.50,
            8.14,
            8.05,
            8.00,
            7.96,
            7.88,
            7.82,
            7.76,
            7.75
    };

    private static int[] FootballPlayerImages = {
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
            R.drawable.j
    };

    public static int[] numberTopPlayer = {
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            10
    };

    static ArrayList<FootballPlayer> getListData() {
        ArrayList<FootballPlayer> list = new ArrayList<>();
        for (int position = 0; position < FootballPlayerNames.length; position++) {
            FootballPlayer footballPlayer = new FootballPlayer();
            footballPlayer.setName(FootballPlayerNames[position]);
            footballPlayer.setDescription(FootballPlayerDescription[position]);
            footballPlayer.setClub(FootballPlayerClub[position]);
            footballPlayer.setCountry(FootballPlayerCountry[position]);
            footballPlayer.setRating(FootballPlayerRating[position]);
            footballPlayer.setPhoto(FootballPlayerImages[position]);
            footballPlayer.setNumberTopPlayer(numberTopPlayer[position]);
            list.add(footballPlayer);
        }
        return list;
    }
}
