import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GetDaysInMonth {

	public static void main(String[] args) {
		int year = 2024;
		int month = 9; // September

		List<LocalDate> fridays = getFridays(year, month);

		for (LocalDate friday : fridays) {
			System.out.println(friday);
		}
	}

	public static List<LocalDate> getFridays(int year, int month) {
		List<LocalDate> fridays = new ArrayList<>();

		LocalDate date = LocalDate.of(year, month, 1);

		while (date.getMonthValue() == month) {
			if (date.getDayOfWeek().getValue() == 5) { // 5 represents Friday
				fridays.add(date);
			}
			date = date.plusDays(1);
		}

		return fridays;

	}

}
