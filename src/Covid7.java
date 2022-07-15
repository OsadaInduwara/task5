import java.util.Arrays;
import java.util.List;

public class Covid7 {

     public static void main(String[] args) {
            List<CovidCases> table = Arrays.asList(
                    new CovidCases("Netherlands", 52.1326f,	5.2913f,	"5/29/2020",	46126	,5931,	0	,40195	,"Europe"),
                    new CovidCases("New Zealand", -40.9006f, 8.6753f, "5/29/2020", 0, 6, 625, 414, "Western Pacific"),
                    new CovidCases("Nicaragua", 12.865416f,	-85.207229f,	"5/29/2020",	759	,35,	370	,354,	"Americas"),
                    new CovidCases("Niger", 17.607789f,	8.081666f	,"5/29/2020"	,955,	64,	813	,78	,"Africa"),
                    new CovidCases("Nigeria",   9.082f,	8.6753f,	"5/29/2020"	,9302,	261	,2697,	6344,	"Africa"),
                    new CovidCases("North Macedonia", 41.6086f,	21.7453f	,"5/29/2020"	,2129	,126	,1516	,487	,"Europe"),
                    new CovidCases("Norway",        60.472f,	8.4689f,	"5/29/2020"	,8422,	236,	7727,	459	,"Europe"),
                    new CovidCases("Oman",         21.512583f	,55.923255f	,"5/29/2020"	,9820	,40	,2396	,7384,	"Eastern Mediterranean"),
                    new CovidCases("Pakistan",         30.3753f	,69.3451f,	"5/29/2020",	66457	,1395,	24131,	40931	,"Eastern Mediterranean"),
                    new CovidCases("Panama",    8.538f	,-80.7821f	,"5/29/2020"	,12531,	326,	7540	,4665	,"Americas"),
                    new CovidCases("Papua New Guinea",         -6.314993f	,143.95555f	,"5/29/2020"	,8,	0	,8,	0	,"Western Pacific"),
                    new CovidCases("Paraguay", -23.4425f,	-58.4438f,	"5/29/2020",	917	,11	,413,	493	,"Americas"));

            System.out.println("Serial values\n-------");
            table.forEach(System.out::println);

            System.out.println("\nParallel values\n-------");
            table.parallelStream().forEach(System.out::println);


        }

    }


