// Maggie Xia
// APCS2 pd1
// HW13--
// 2017-03-06

public class Tester {    

    public static void swap ( int[] arr, int x, int y ) {
	
	int h = arr[x];
	arr[x] = arr[y];
	arr[y] = h;
	
    }
    
    public static int mysterion ( int[] arr, int a, int b, int c ) {
	
	int v = arr[c];
	swap( arr, c, b );
	int s = a;

	for ( int i = a; i < b; i++ ) {
	    if ( arr[i] < v ) {
		swap( arr, s, i );
		s += 1;
	    }
	}

	swap( arr, b, s );
	return s;
    }

    public static void main ( String[] args ) {

	//initiate array
	int[] arr = new int[4];
	//populate
	for ( int i = 0; i < 4; i++ ) {
	    arr[i] = (int) ( Math. random() * 50 + 1 );//min=1, max=50
	}

	//initiate a, b, and c as random integers from 0 to 3
	int a = (int)( Math. random() * 4 );
	int b = (int)( Math. random() * 4 );
	while ( b == 1 ) {//discovered in class that b should not be 1
	    b = (int)( Math. random() * 4 );
	}
	int c = (int)( Math. random() * 4 );

	mysterion( arr, a, b, c );
	System.out.println( mysterion( arr, a, b, c );

    }
}
