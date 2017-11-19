#include <iostream>
#include <string>
#include <stdio.h>
#include <cstdlib>

void printSpace( int count ) {
	for ( int i = 0; i < count; i++ )
		printf( " " );
}

void printRaute( int count ) {
	for ( int i = 0; i < count; i++ )
		printf( "#" );
}

void printNewLine(int count ) {
	for ( int i = 0; i < count; i++ )
		printf( "\n" );
}

void printTree( int count ) {	
	for ( int i = 0; i < count; i++ ) {
		for ( int j = 0; j < i - 1; j++ ) {
			printSpace( count - j - 1 );
			printRaute( 3 + ( j * 2 ) );
			printNewLine( 1 );
		}
		printSpace( count - i );
		printRaute( ( i * 2 ) == 0 ? 1 : i * 2 + 1 );
		printNewLine( 1 );
		printSpace( count - 1 - i );
		printRaute( 3 + ( i * 2 ) );
		printNewLine( 1 );
		printSpace( count );
		printRaute( 1 );
		printNewLine( 1 );
	}
}

int main() {
	std::string line_str;
	std::getline( std::cin, line_str );
	int number = atoi( line_str.c_str( ) );
	if ( number < 1 || number > 100 )
		printf( "error\n" );

	printTree( number );
	std::cin.get( );
	return 0;
}