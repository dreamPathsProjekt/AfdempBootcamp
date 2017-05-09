/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise4;

/**
 *
 * @author DreamPathsProjekt
 */
public class Exercise4 {

    /*Timers to measure average execution time of the function*/
    public static final int TERMS = 5; /* problem asks for 5 TERMS change to scanner to accept user input*/
    public static long []startTime= new long [TERMS];
    public static long []endTime= new long [TERMS];
    public static long []duration= new long [TERMS];
    public static long avgDuration;
    
    /*measure total execution time for all TERMS*/
    public static long startTotal;
    public static long endTotal;
    public static long durationTotal;

    public static void main(String [] args) {    
        

        System.out.println("Harmonic Sequence for the first 5 TERMS without recursion");
        
        startTotal=System.nanoTime();
        for (int i=1;i<=TERMS;i++){
                startTime[i-1] = System.nanoTime();
                float total= harmonicSeq(i);
                endTime[i-1] = System.nanoTime();
                duration[i-1] = (endTime[i-1]-startTime[i-1]);
                System.out.println(total);  
        }
        endTotal=System.nanoTime();
        durationTotal=endTotal-startTotal;
        
        for(int i=0;i<duration.length;i++){
            avgDuration+=(duration[i]);
            avgDuration/=duration.length;
        }
        System.out.printf("Average Execution time for the function %d ns.\n",avgDuration);
        System.out.printf("Total execution time for 5 TERMS %d ns.",durationTotal);
        
        System.out.println("\n");        
        System.out.println("Harmonic Sequence for the first 5 TERMS using Bottom-Up dynamic recursion");

        startTotal=System.nanoTime();
        for (int i=1;i<=TERMS;i++){
                startTime[i-1] = System.nanoTime();
                float total= harmonicSeqBU(i);
                endTime[i-1] = System.nanoTime();
                duration[i-1] = (endTime[i-1]-startTime[i-1]);
                System.out.println(total);  
        } 
        endTotal=System.nanoTime();
        durationTotal=endTotal-startTotal;
        
        for(int i=0;i<duration.length;i++){
            avgDuration+=(duration[i]);
            avgDuration/=duration.length;
        }
       System.out.printf("Average Execution time for the function %d ns.\n",avgDuration);
       System.out.printf("Total execution time for 5 TERMS %d ns.",durationTotal);

        System.out.println("\n");
        System.out.println("Harmonic Sequence for the first 5 TERMS using Top-Down dynamic recursion");

        startTotal=System.nanoTime();
        for (int i=1;i<=TERMS;i++){
                startTime[i-1] = System.nanoTime();
                float total= harmonicSeqTD(i);
                endTime[i-1] = System.nanoTime();
                duration[i-1] = (endTime[i-1]-startTime[i-1]);
                System.out.println(total);  
        }
        endTotal=System.nanoTime();
        durationTotal=endTotal-startTotal;
        
        for(int i=0;i<duration.length;i++){
            avgDuration+=(duration[i]);
            avgDuration/=duration.length;
        }
        System.out.printf("Average Execution time for the function %d ns.\n",avgDuration);
        System.out.printf("Total execution time for 5 TERMS %d ns.",durationTotal);

    }

    /*Without Recursion*/
    
    public static float harmonicSeq(int n){
            float total = 1.0f;

            for(int i=2;i<=n;i++){
                total += 1.0f/i; /*ouch ,if you don't use 1.0f for division , something bad may happen */
            }
            return total;
        
    }

    
    /* Bottom-up example*/
    public static float harmonicSeqBU(int n) {
        float [] cachedValues = new float[n+1];
        
        cachedValues[0]=0;
        cachedValues[1]=1;
        for (int i=2;i<=n;i++){
            cachedValues[i] = (1.0f/i)+ harmonicSeqBU(i-1); 
        }
        return cachedValues[n];
    }
    
    /* Top-Down example*/    
    public static float harmonicSeqTD(int n) {
        float [] cachedValues = new float[n+1];
        
        if (n==0) return 0;
        if (n==1) return 1;
        if (cachedValues[n]>0) return cachedValues[n];
        cachedValues[n] = harmonicSeqTD(n-1)+1.0f/n;
        return cachedValues[n];
    }

}
