package com;

abstract class StudentListener {
	abstract void listen();
}

class Trainer {

	void teach(StudentListener sl) {

		sl.listen();
	}

}

public class AnonymousDemo {

	public static void main(String[] args) {

//		StudentListener sl = new StudentListener() {
//			@Override
//			public void listen() {
//
//			}
//		};

		//sl.listen();
		
		//-----------------------------
		
		Trainer trainer=new Trainer();
		trainer.teach(new StudentListener() {
			@Override
			void listen() {
				
			}
		});

	}

}
