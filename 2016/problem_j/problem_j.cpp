#include <iostream>
#include <string>
#include <math.h>
#include <stdio.h>
#include <cstdlib>

int main( ) {

	std::string line_str;
	std::getline( std::cin, line_str );

	int in = atoi( line_str.c_str( ) );
	float forone = ( float )( 1 / ( float )in );
	float distance = sqrt( forone );
	float out = distance * 10;

	printf( "%.2f\n", out );
	return 0;
}
