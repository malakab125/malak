package malak.malak;

//malak aboud 212684583
//aya kabha 213624471
public class q4 {
	public static String calculate (double a, double b, String mod) {
		switch(mod) {


		case "regular":
			if(a < b)
				return "B";
			else
				return "A";

		case "negatives":
			if(-a >= -b)
				return "A";
			else return "B";

		case "reciprocals":
			if (a == 0 || b == 0) {
		        return "Error"; 
		    }
			if ((1/a) >= (1/b))
				return "B";
			else
				return "A";

		default:
			 return "Error: Invalid mode.";

		}

	}
}


