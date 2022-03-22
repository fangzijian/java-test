public class HelloWorldTest {
    public static void main(String[] args) {
        System.out.println("1");
        try {
            testE();
        } catch (Exception e) {
            System.out.println("result" + e);
        }
    }
    
    public static void testE() throws Exception {
        try {
            Thread.sleep(1000);
            throw new Exception("fangzijian test");
        } catch (Exception e) {
            System.out.println(e);
            throw e;
        }
    }
}
