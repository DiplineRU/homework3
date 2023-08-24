public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //Задача 1.

        byte num0 = 1;
        short num1 = 128;
        int num2 = 32768;
        long num3 = 2147483648L;

        System.out.println("Значение переменной с типом byte равно " + num0 );
        System.out.println("Значение переменной с типом short равно " + num1 );
        System.out.println("Значение переменной с типом int равно " + num2 );
        System.out.println("Значение переменной с типом long равно " + num3 );
        System.out.println("--------------------------------------------------" );

        //Задача 2.

        float Num = 27.12f;
        long Num0 = 987678965549L;
        float Num1 = 2.786f;
        short Num2 = 569;
        short Num3 = -159;
        short Num4 = 27897;
        byte Num5 = 67;


        //Задача 3.

        byte luda = 23;
        byte anna = 27;
        byte katya = 30;
        short vsegoListov = 480;
        byte vsegoShkoloti = (byte)  (luda + anna + katya); // на тип byte он жалуется, вопрос, почему? в сумме же будет "80" в пределе типа byte
        short listNaOdnogo = (short) (vsegoListov / vsegoShkoloti);
        System.out.println("На каждого ученика рассчитано " + listNaOdnogo + " листов бумаги");
        System.out.println("--------------------------------------------------" );

        //Задача 4.

        //2 минуты = 16 бутылок
        byte min1 = 16 / 2; //1 min   = 8
        short min20 = 8 * 20;
        System.out.println("За 20 минут машина произвела " + min20 + " бутылок");
        short minInOneHourse = 24 * 60; //minyt v 24 chasah  = 1440
        short sytki = 1440 * 8;
        System.out.println("За сутки машина произвела " + sytki + " бутылок");
        short minInThreeDay = 1440 * 3; // minut v 3 dnyah   = 4320
        int day3 = 4320 * 8;
        System.out.println("За 3 дны машина произвела " + day3 + " бутылок");
        int odinMesyats = 1440 * 30; //minyt v mesyatse  = 43 200
        int OneMouth = 43200 * 8;
        System.out.println("За один месяц машина произвела " + OneMouth + " бутылок");
        System.out.println("--------------------------------------------------" );

        //Задача 5.
        // 1 класс = 2 банки белой + 4 банки коричневой краски = 6 красов общее
        byte paintsForOneClass = 120 / 6;       // 20 klassov vsego
        byte wightPaint = 20 * 2;           //40 beloi kraski vsego
        byte korichevoiPaint = 20 * 4;      // 80 korichnevoi kraski
        System.out.println("В школе, где " + paintsForOneClass + " классов, нужно " + wightPaint + " банок белой краски и " + korichevoiPaint + " банок коричневой краски");
        System.out.println("--------------------------------------------------" );



        //Задча 6.
        short banana = 5 * 80; //gramm v 5 bananah
        System.out.println("Banana " + banana +" gramm");
        short milk = 105 * 2; // gramm v 200 ml
        System.out.println("Milk "+ milk + " gramm");
        short iceCream = 2 * 100; // gramm v morojenom
        System.out.println("Ice cram " + iceCream + " gramm");
        short egg = 4 * 70; // gramm v 4 yaishah
        System.out.println("Egg " + egg + " gramm");
        int totalGramm =  (banana + milk + iceCream + egg);
        float kg =  (float) totalGramm / 1000;
        System.out.println("Общий вес в граммах - " + totalGramm + " . Общий вес в кг - " + kg);
        System.out.println("--------------------------------------------------" );

        //Задача 7.
        byte nadoSkinyt = 7;
        short skinytGramm = (short) (nadoSkinyt * 1000);
        short evryDay250 = (short) (skinytGramm / 250);
        System.out.println(evryDay250 + " Дней потребутеся спортсмену что бы сбросить вес если каждый день по 250 грамм");
        short evryDay500 = (short) (skinytGramm / 500);
        System.out.println(evryDay500 + " Дней потребутеся спортсмену что бы сбросить вес если каждый день по 500 грамм");
        System.out.println("--------------------------------------------------" );

        //Задача 8.

        var masha = 67760;
        var denis = 83690;
        var kristina = 76230;

        var mashaOneYear = masha * 12;
        var denisOneYear = denis * 12;              // узнали годовую зп со старой зп
        var kristinaOneYear = kristina * 12;

        var mashaRaiseSalary = masha * 0.1 + masha;
        var denisRaiseSalay = denis * 0.1 + denis;          //подняли зп на 10%
        var kristinaRaiseSalay = kristina * 0.1 + kristina;

        var mashaAfterUpSalary = mashaRaiseSalary * 12;
        var denisAfterUpSalary = denisRaiseSalay * 12;      //годовая зп после поднятия зп
        var kristinaAfterUpSalary = kristinaRaiseSalay * 12;

        var mashaDiffrenceAfterIncrease = mashaAfterUpSalary - mashaOneYear;
        var denisDiffrenceAfterIncrease = denisAfterUpSalary - denisOneYear;
        var kristinaDiffrenceAfterIncrease = kristinaAfterUpSalary - kristinaOneYear;

        var salaryAfter = (mashaAfterUpSalary + denisAfterUpSalary + kristinaAfterUpSalary) - (mashaOneYear + denisOneYear + kristinaOneYear);
        System.out.println("Разница между годовой зарплатой после повышение общее - " + salaryAfter);

        System.out.println("Годовая зарплата Маши до повышения - " + mashaOneYear + ". Годовая зарплата после повышения - " + mashaAfterUpSalary + ". Разница на - " + mashaDiffrenceAfterIncrease);
        System.out.println("Годовая зарплата Дениса до повышения - "+ denisOneYear + ". Годовая зарплата после повышения - " + denisAfterUpSalary + ". Разница на - " + denisDiffrenceAfterIncrease);
        System.out.println("Годовая зарплата Кристины до повышения - " + kristinaOneYear + ". Годовая зарплата после повышения - " + kristinaAfterUpSalary + ". Разница на - " + kristinaDiffrenceAfterIncrease);

        System.out.println("Маша теперь получает " + mashaRaiseSalary + " рублей. Годовой доход вырос на " + mashaDiffrenceAfterIncrease + " рублей.");
        System.out.println("Денис теперь получает " + denisRaiseSalay + " рублей. Годовой доход вырос на " + denisDiffrenceAfterIncrease + " рублей");
        System.out.println("Кристина теперь получает " + kristinaRaiseSalay + " рублей. Годовой доход вырос на " + kristinaDiffrenceAfterIncrease + " рублей");

    }
}