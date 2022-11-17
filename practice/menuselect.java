import java.util.Scanner;
class menuselect{
	public static void main(String args[]){
        	Scanner scan = new Scanner(System.in);
        	int choice;
        
        	do{
            		System.out.println("Menu: ");
            		System.out.println("1. Kpop");
            		System.out.println("2. Rap");
            		System.out.println("3. Pop");
            		System.out.println("4. Bollywood");
            		System.out.println("5. EDM");
			        System.out.println("6. RnB");
            
            		System.out.println("Choose any one : ");
            		choice = scan.nextInt();
        	}while(choice < 1 || choice > 6);
        		System.out.println("\n");
        
        		switch(choice){
            			case 1 : System.out.println("Kpop:\n");
                			System.out.println("1. Stray Kids");
                			System.out.println("2. Seventeen");
					        System.out.println("3. Itzy");
                			System.out.println("4. NCT");
                			break;
            
            			case 2 : System.out.println("Rap:\n");
                			System.out.println("1. Travis Scott");
                			System.out.println("2. Kanye West");
					        System.out.println("3. Lil Wayne");
                			System.out.println("4. Kendrick Lamar");
                			break;
                
            			case 3 : System.out.println("Pop:\n");
                			System.out.println("1. Justin Beiber");
                			System.out.println("2. Selena Gomez");
					        System.out.println("3. Britney Spears");
                			System.out.println("4. Ariana Grande");
                			break;
                
            			case 4 : System.out.println("Bollywood:\n");
					        System.out.println("1. Arijit Singh");
                			System.out.println("2. Shreya Ghoshal");
					        System.out.println("3. Ankit Tiwari");
                			System.out.println("4. Atif Aslam");
                			break;
            
            			case 5 : System.out.println("EDM:\n");
					        System.out.println("1. Martin Garrix ");
                			System.out.println("2. David Guetta");
					        System.out.println("3. Avicii ");
                			System.out.println("4. Skrillex");
                			break;
				        case 6 : System.out.println("RnB:\n");
					        System.out.println("1. Alicia Keys");
                			System.out.println("2. Mariah Carey");
					        System.out.println("3. Usher");
                			System.out.println("4. The Weeknd");
                			break;
        		}
	}
}