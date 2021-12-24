package demo;
//Example program for Abstract class
public abstract class Worker 
{

public static void main(String[] args) 
{
////		Worker w = new Worker();
////		w.getleaves();
////		w.getHike();
////		w.work();
////		
}

public void getleaves()
{
	System.out.println("10 Days Leave");
}

public void getHike()
{
	System.out.println("Annually");
}

public abstract void work();

public class SubWorker extends Worker{

	
{
		SubWorker sw = new SubWorker();
		sw.getleaves();
		sw.getHike();
		sw.work();
}
public void work()
{
	System.out.println("HARD WORK");
}
}
}


