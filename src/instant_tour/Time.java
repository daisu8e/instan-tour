package instant_tour;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Time {

  private static final Pattern DAY_PATTERN = Pattern.compile("(\\d+) *days?");
  private int hours;

  public Time(String string) {
    this.hours = parseHours(string);
  }

  public int getHours() {
    return this.hours;
  }

  public static int parseHours(String string) {
    Matcher matcher;

    matcher = DAY_PATTERN.matcher(string.toLowerCase());
    if (matcher.find()) return Integer.parseInt(matcher.group(1)) * 8;

    return Integer.parseInt(string);
  }
}
