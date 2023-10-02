public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //Задача 1.

        byte num0 = 1;
        short num1 = 128;
        int num2 = 32768;
        long num3 = 2147483648L;
        float num4 = 0.1F;
        double num5 = 0.1234567890;

        System.out.println("Значение переменной с типом byte равно " + num0 );
        System.out.println("Значение переменной с типом short равно " + num1 );
        System.out.println("Значение переменной с типом int равно " + num2 );
        System.out.println("Значение переменной с типом long равно " + num3 );
        System.out.println("Значение переменной с типом float равно " + num4 );
        System.out.println("Значение переменной с типом double равно " + num5 );
        System.out.println("--------------------------------------------------" );

        //Задача 2.

        float number = 27.12f;
        long number0 = 987678965549L;
        float number1 = 2.786f;
        short number2 = 569;
        short number3 = -159;
        short number4 = 27897;
        byte number5 = 67;


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
        short min20 = (short) (min1 * 20);
        System.out.println("За 20 минут машина произвела " + min20 + " бутылок");
        short minInOneHourse = 24 * 60; //minyt v 24 chasah  = 1440
        short sytki = (short) (minInOneHourse * min1);
        System.out.println("За сутки машина произвела " + sytki + " бутылок");
        short minInThreeDay = (short) (minInOneHourse * 3); // minut v 3 dnyah   = 4320
        int day3 = minInThreeDay * min1;
        System.out.println("За 3 дны машина произвела " + day3 + " бутылок");
        int odinMesyats = minInOneHourse * 30; //minyt v mesyatse  = 43 200
        int OneMouth = odinMesyats * min1;
        System.out.println("За один месяц машина произвела " + OneMouth + " бутылок");
        System.out.println("--------------------------------------------------" );

        //Задача 5.
        // 1 класс = 2 банки белой + 4 банки коричневой краски = 6 красов общее
        byte totalPaint = 120;
        byte wightPaints = 2;
        byte brownPaints = 4;
        byte paintsForOneClass = (byte) (totalPaint / (wightPaints + brownPaints));       // 20 klassov vsego
        byte wightPaint = (byte) (paintsForOneClass * wightPaints);           //40 beloi kraski vsego
        byte korichevoiPaint = (byte) (paintsForOneClass * brownPaints);      // 80 korichnevoi kraski
        System.out.println("В школе, где " + paintsForOneClass + " классов, нужно " + wightPaint + " банок белой краски и " + korichevoiPaint + " банок коричневой краски");
        System.out.println("--------------------------------------------------" );



        //Задча 6.
        byte oneBanana = 80;
        short banana = (short) (5 * oneBanana); //gramm v 5 bananah
        System.out.println("Banana " + banana +" gramm");
        byte mlInOneMilk = 105;
        short milk = (short) (mlInOneMilk * 2); // gramm v 200 ml
        System.out.println("Milk "+ milk + " gramm");
        byte icePlombir = 100;
        short iceCream = (short) (2 * icePlombir); // gramm v morojenom
        System.out.println("Ice cram " + iceCream + " gramm");
        byte oneEgg = 70;
        short egg = (short) (4 * oneEgg); // gramm v 4 yaishah
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
        short average = (short) ((evryDay500 + evryDay250) / 2);
        System.out.println(average + " дней в среднем потребуется спортсмену что бы сбросить вес");
        System.out.println("--------------------------------------------------" );

        //Задача 8.

        var masha = 67760;
        var denis = 83690;
        var kristina = 76230;

        var mashaOneYear = masha * 12;
        var denisOneYear = denis * 12;              // узнали годовую зп со старой зп
        var kristinaOneYear = kristina * 12;

        var tenProcent = 0.1;

        var mashaRaiseSalary = masha * tenProcent + masha;
        var denisRaiseSalay = denis * tenProcent + denis;          //подняли зп на 10%
        var kristinaRaiseSalay = kristina * tenProcent + kristina;

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