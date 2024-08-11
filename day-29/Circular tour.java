class Solution
{
    //Function to find starting point where the truck can start to get through
    //the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[])
    {
        int n = petrol.length;
	  	int start = 0, fueltank = 0, fuelshortage = 0;
	  	for(int i=0;i<n;++i){
	  	    fueltank += petrol[i] - distance[i];
	  	    if(fueltank < 0){
	  	        start = i+1;
	  	        fuelshortage += fueltank;
	  	        fueltank = 0;
	  	    }
	  	}
	  	if(fueltank + fuelshortage >= 0){
	  	    return start;
	  	}
	  	else return -1;
    }
}

Time Complexity: O(n)
Space Complexity: O(1)
