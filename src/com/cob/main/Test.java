package com.cob.main;

public class Test {

	public static void main(String[] args) {
		Runnable runnable = () -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Aishwary Dangre");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Thread secondThread = new Thread(runnable);
		secondThread.start();

		for (int j = 0; j <= 5; j++) {
			System.out.println("Rahul Dangre");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
