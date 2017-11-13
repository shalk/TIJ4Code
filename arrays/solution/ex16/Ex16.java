package arrays.solution.ex16;

import net.mindview.util.CountingGenerator;

class SkipGenerator {
	public static class Integer extends CountingGenerator.Integer{
		private int skip;
		
		public Integer() {
			skip = 0;
		}
		
		public Integer(int skip) {
			this.skip = skip;
		}


		@Override
		public java.lang.Integer next() {
			for (int i = 0; i < skip; i++)
				super.next();
			return super.next();
		}
		
	}
}
public class Ex16 {
	public static void main(String[] args) {
		
		
	}

}
