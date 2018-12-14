package com.revature;

import com.revature.entity.GenericPizzaBuilder;
import com.revature.entity.Pizza;
import com.revature.entity.PizzaBuilder;
import com.revature.entity.Sauce;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Pizza pizza = new PizzaBuilder()
				.withSauce(Sauce.ALFREDO)
				.withSize(10)
				.withCrust("Thin")
				.buildPizza();
		
		Pizza p2 = new PizzaBuilder().withSize(15).buildPizza();
		
		Pizza magicPizza = new GenericPizzaBuilder()
				.with(var -> {
					var.size = 12;
					var.sauce = Sauce.ALFREDO;
					var.crust = "Thin";
				}).buildPizza();
				
//		List<String> toppings = new ArrayList<>();
//		toppings.add("Cheese");
//
//		Thread t1 = new Thread(new OrderService(1, toppings));
//		t1.start();
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		Thread t2 = new Thread(new OrderService(2, toppings));
//		t2.start();
		
		//Pizza p = new Pizza(10, "Deep Dish", Sauce.BARBEQUE);
		
		//Anonymous function
//		Runnable r1 = new Runnable() {
//			public void run() {
//				for(int i = 0; i < 50000; i++) {
//					System.out.println("cow");
//				}
//			}
//		};
//		new Thread(r1).start();
//		
//		//Lambda function
//		Runnable r2 = () -> {for (int i = 0; i < 50000; i++) {System.out.println("chicken");}};
//		new Thread(r2).start();
		
		
//		System.out.println("Welcome to Pizza Party!");
//		List<String> toppings = new ArrayList<>();
//		toppings.add("Cheese");
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println(sc.next());
//		if (sc.hasNextInt())
//			System.out.println(sc.nextInt());
//		System.out.println(sc.nextLine());
//		System.out.println(sc.next());
//
//		File file = new File("output.txt");
//		try (FileOutputStream fos = new FileOutputStream(file, true); PrintStream ps = new PrintStream(fos);) {
//			System.setOut(ps);
//			System.out.println("Goodbye!");
//			fos.flush();
//			ps.flush();
//		} catch (FileNotFoundException e) {
//
//		} catch (IOException e) {
//
//		}
//		sc.close();
//
//		Order order = new OnlineOrder(1, toppings);
	}

	public static <T, E> void sum(T value, E secondValue) {
		System.out.println(value + " " + secondValue);
	}

}
