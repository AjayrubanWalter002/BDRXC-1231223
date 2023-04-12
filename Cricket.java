package COLLECTION33Streams;

	public class Cricket {
		private String name;
		private int age;
		private int run;
		private int noOfWickets;
		private boolean isBatsman;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getRun() {
			return run;
		}
		public void setRun(int run) {
			this.run = run;
		}
		public int getNoOfWickets() {
			return noOfWickets;
		}
		public void setNoOfWickets(int noOfWickets) {
			this.noOfWickets = noOfWickets;
		}
		public boolean isBatsman() {
			return isBatsman;
		}
		public void setBatsman(boolean isBatsman) {
			this.isBatsman = isBatsman;
		}
		public Cricket(String name, int age, int run, int noOfWickets, boolean isBatsman) {
			this.name = name;
			this.age = age;
			this.run = run;
			this.noOfWickets = noOfWickets;
			this.isBatsman = isBatsman;
		}

		public String toString() {
			return "Cricket name=" + name + ", age=" + age + ", run=" + run + ", noOfWickets=" + noOfWickets + ", isBatsman="
					+ isBatsman;
		}

		}


