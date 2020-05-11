package com.vb.learning;

public class StringPermutations 
{
	static int x = 0;

	public static void main( String[] args )
	{
		permutation( "", "abcde" );
	}

	private static void permutation( String prefix, String str )
	{
		System.out.println( ++x ); //x=1
		int n = str.length(); //5
		if ( n == 0 )
			System.out.println( prefix );
		else
		{
			for ( int i = 0; i < n; i++ )
				permutation( prefix + str.charAt( i ), str.substring( 0, i ) + str.substring( i + 1, n ) );
		}
	}
}