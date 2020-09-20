public class TestAuthor {
        public static void main(String[] args)
        {
            Author d1 = new Author("Lev.T", "tolstoy15", 'm');
            Author d2 = new Author("Bah.C", "28uy15", 'm');
            Author d3 = new Author("Nik.L", "mirea", 'f');

            d1.setEmail("like");

            System.out.println(d1);
            System.out.println(d2);
            System.out.println(d3);
        }
    }

