public class Example {

    public static void main(String[] args) {
        Example.repeatedString("aba", 10);
    }

    public static void repeatedString(String s, int n) {

        /*
         * Սա String-ը մեծացնելու համար է, եթե String-ը "aba" է ու int-ը կուդանք 10, կմեծանա 3 անգամ։
         * Մեծացումը տեղի է ունենում բաժանումով, int-ը բաժանվում է String-ի length-ին։ Այս դեպքում String-ը
         * կրկնվում է 3 անգամ։
         * */
        long number = n / s.length();
        /*
         * Եթե բաժանման ընթացքում մնացորդ է ավելանում, ես տողով կվերցնենք եդ մնացորդը։
         * */
        long reminder = n % s.length();
        long answer = 0;

        for (int i = 0; i < s.length(); i++) {
            /*
             * Ստուգում ենք եթե, i-րդ char-ը համապատասխանում է a-ին, ապա answer-ին += ենք անում number-ը,
             * քանի որ, number-ը մեր տված String-ի կրկնվելու քանաքն է։
             * */
            if (s.charAt(i) == 'a') {
                answer += number;
                /*
                 * Ստուգում ենք եթե i-րդ արժեքը փոքր է reminder-ից, answer-ը ինկրիմենտացիա կենենք։
                 * */
                if (i < reminder)
                    answer++;
            }
        }
        System.out.println(answer);
    }

}
