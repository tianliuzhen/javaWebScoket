
public class Foo {
	    private static  int x = 100;//100

	    public    int getX() {
	        return x;
	    }

	    public int fix(int y) {
	              x = x - y;
	          return x;
	    }
	}