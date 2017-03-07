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

    public static void printArr ( int[] arr ) {
	
	String print =  "[ ";
	for ( int i = 0; i < arr.length - 1; i++  ) {
	    print = print + arr[i] + ", ";
	}
	print = print + arr[ arr.length - 1 ] + " ]";
	System.out.println( print );
	
    }
    
    public static int mysterion ( int[] arr, int a, int b, int c ) {

	printArr( arr );
	int v = arr[c];
	System.out.println( "v = " + v );
	
	swap( arr, c, b );
	printArr( arr );
	int s = a;
	System.out.println( "s = " + s );

	for ( int i = a; i < b; i++ ) {
	    if ( arr[i] < v ) {
		swap( arr, s, i );
		printArr( arr );
		s += 1;
		System.out.println( "s is now = " + s );
	    }
	}

	swap( arr, b, s );
	printArr( arr );
	System.out.println ( "Final s = " + s );
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

	System.out.println( "==============================" );
	System.out.println( "Test Case #1:" );
	mysterion( arr, a, b, c );
	System.out.println( "==============================" );

	//initiate array
	int[] brr = new int[4];
	//populate
	for ( int i = 0; i < 4; i++ ) {
	    arr[i] = (int) ( Math. random() * 50 + 1 );//min=1, max=50
	}

	//initiate d, e, and f as random integers from 0 to 3
	int d = (int)( Math. random() * 4 );
	int e = (int)( Math. random() * 4 );
	while ( e == 1 ) {//discovered in class that b should not be 1
	    e = (int)( Math. random() * 4 );
	}
	int f = (int)( Math. random() * 4 );

	System.out.println( "==============================" );
	System.out.println( "Test Case #2:" );
	mysterion( brr, d, e, f );
	System.out.println( "==============================" );

	//initiate array
	int[] crr = new int[4];
	//populate
	for ( int i = 0; i < 4; i++ ) {
	    arr[i] = (int) ( Math. random() * 50 + 1 );//min=1, max=50
	}

	//initiate g, h, and j as random integers from 0 to 3
	int g = (int)( Math. random() * 4 );
	int h = (int)( Math. random() * 4 );
	while ( h == 1 ) {//discovered in class that b should not be 1
	    h = (int)( Math. random() * 4 );
	}
	int j = (int)( Math. random() * 4 );

	System.out.println( "==============================" );
	System.out.println( "Test Case #3:" );
	mysterion( crr, g, h, j );
	System.out.println( "==============================" );

	//initiate array
	int[] drr = new int[4];
	//populate
	for ( int i = 0; i < 4; i++ ) {
	    arr[i] = (int) ( Math. random() * 50 + 1 );//min=1, max=50
	}

	//initiate a, b, and c as random integers from 0 to 3
	int k = (int)( Math. random() * 4 );
	int l = (int)( Math. random() * 4 );
	while ( l == 1 ) {//discovered in class that b should not be 1
	    l = (int)( Math. random() * 4 );
	}
	int m = (int)( Math. random() * 4 );

	System.out.println( "==============================" );
	System.out.println( "Test Case #4:" );	
	mysterion( drr, k, l, m );
	System.out.println( "==============================" );

    }
}
