package com.fulcrum.threading;

public class ResolveDeadLockTest {
	
	public static void main(String[] args) {
		
		ResolveDeadLockTest deadLockTest = new ResolveDeadLockTest();
		
		final A a = deadLockTest.new A();
		final B b = deadLockTest.new B();
		
		Runnable  block1 = new Runnable() {
			
			@Override
			public void run() {
				synchronized (b) {
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (a) {
						System.out.println("In block 1");
					}
				}
			}
		};
		
		
		Runnable block2 = new Runnable() {
			
			@Override
			public void run() {
				synchronized (b) {
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					synchronized (a) {
						System.out.println("In block 2");
					}
				}
			}
		};
		
		new Thread(block1).start();
		new Thread(block2).start();
	}
	
	
	private class A{
		
		private int i = 10;

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}
		
		
		
	} 
	
private class B{
		
		private int i = 20;

		public int getI() {
			return i;
		}

		public void setI(int i) {
			this.i = i;
		}
		
		
		
	} 
}
