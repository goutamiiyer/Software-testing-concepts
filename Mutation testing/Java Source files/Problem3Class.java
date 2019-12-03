package Homework5;

public class Problem3Class {

	public int calcPrevDayNum (int month, int day, int year) {
		int result=0, daysIn[] = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30};

		if (month<2 && day<2)
			result = (((year-1)%4!=0) || (((year-1)%100==0) && ((year-1)%400!=0))) ? 365:366;
		
		else {
			daysIn[1] = ((year%4!=0) || ((year%100==0) && (year%400!=0))) ? 28:29;
	
			for (int i=0;i<month-1;i++)
				result+=daysIn[i];
			result+=day-1;
		}
		return result;
	}
}