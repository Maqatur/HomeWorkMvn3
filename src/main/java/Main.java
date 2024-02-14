import ru.netology.services.homeworkmvn3.RestService;

public class Main {

    public static void main(String[] args) {

        RestService service = new RestService();
        int count = service.calcRest(10_000, 3_000, 20_000);
        System.out.println("Количество нерабочих месяцев: " + count);

        count = service.calcRest(100_000, 60_000, 150_000);
        System.out.println("Количество нерабочих месяцев: " + count);

    }

}
