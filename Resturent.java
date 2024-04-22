package com.dileep;

class resturent{
    public static void main(String[] args){

        Kitchen k1 = new Kitchen();
        k1.start();
        Kitchen k2 = new Kitchen();
        k2.start();
        Kitchen k3 = new Kitchen();
        k3.start();
    }

}

class Kitchen extends Thread{
    public void run(){
        System.out.println("Order Recieved");
        preparefood();
    }
    public synchronized void preparefood(){
      

        System.out.println("Food Preparation : Started");
        try{
            Thread.sleep(3000);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Food Preparation : Done");

    }
}


