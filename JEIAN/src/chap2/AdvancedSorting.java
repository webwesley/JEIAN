package chap2;

import java.text.Collator;
import java.text.CollationKey;
import java.util.Locale;

public class AdvancedSorting {

	public static interface Comparer {
		public int compare(Object a, Object b);
	}
	
	public static interface Comparable {
		public int compareTo(Object other);
	}
	
	private static Comparer ascii_comparer = new Comparer() {
		public int compare(Object a, Object b) {
			return ((Stirng)a).compareTo((String)b);
		}
	}

}
