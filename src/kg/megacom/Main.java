package kg.megacom;

import kg.megacom.enums.ClientStatus;
import kg.megacom.models.Client;
import kg.megacom.models.Department;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here




        Department kassaDep = new Department(1,"Касса");
        Department creditDep = new Department(2,"Кредитный");

        Client client1 = new Client(1,kassaDep, ClientStatus.GOLD);
        Client client2 = new Client(2,kassaDep, ClientStatus.CLASSIC);
        Client client3= new Client(3,kassaDep, ClientStatus.CLASSIC);
        Client client4 = new Client(4,kassaDep, ClientStatus.PLATINUM);
        Client client5 = new Client(5,kassaDep, ClientStatus.PLATINUM);
        Client client6 = new Client(6,creditDep, ClientStatus.CLASSIC);
        Client client7 = new Client(7,creditDep, ClientStatus.CLASSIC);
        Client client8 = new Client(8,creditDep, ClientStatus.GOLD);
        Client client9 = new Client(9,creditDep, ClientStatus.PLATINUM);
        Client client10 = new Client(10,creditDep, ClientStatus.PLATINUM);

        List<Client> clients = Arrays.asList(
                client1,
                client2,
                client3,
                client4,
                client5,
                client6,
                client7,
                client8,
                client9,
                client10
        );

        Queue<Client> deque = new PriorityQueue<>(Collections.reverseOrder());

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Выберите действие:");
            System.out.println("1.Посмотреть очередь на кассу\n2.Посмотреть очередь на отдел кредит");
            System.out.println("3.Позвать следующего клиента на кассу\n4.Позвать следующего клиента в отдел кредит");
            System.out.println("5.Выход");
            System.out.print("Ваш выбор:");
            int choose = scanner.nextInt();

            if (choose == 1){
                System.out.println("Очередь на кассу : ");
                deque.offer(client2);
                deque.offer(client5);
                deque.offer(client3);
                deque.offer(client4);
                deque.offer(client1);


                System.out.println(deque.poll());
                System.out.println(deque.poll());
                System.out.println(deque.poll());
                System.out.println(deque.poll());
                System.out.println(deque.poll());


            }
            if(choose == 2){
                System.out.println("Очередь на кредит :");
                deque.offer(client10);
                deque.offer(client7);
                deque.offer(client9);
                deque.offer(client8);
                deque.offer(client6);


                System.out.println(deque.poll());
                System.out.println(deque.poll());
                System.out.println(deque.poll());
                System.out.println(deque.poll());
                System.out.println(deque.poll());



            }
            if(choose == 3){
                System.out.println("Следующий клиент на кассу :");
                deque.offer(client4);
                System.out.println(deque);
                System.out.println("******************************************************************************");
            }
            if(choose == 4){
                System.out.println("Следующий клиент в отдел кредиторинга");
                deque.offer(client9);
                System.out.println(deque);
            }
            if(choose == 5){
                System.out.println("До свидание!");
                break;
            }



        }

















    }
}
