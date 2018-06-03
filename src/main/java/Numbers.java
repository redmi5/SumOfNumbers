public class Numbers {

        public static Integer sum(Integer number){
            Integer sum=0;
            Integer ostatok=0;
            while(number>0) {
                ostatok = number % 10;
                sum = sum + ostatok;
                number = number / 10;
            }
            return sum;
        }

}
