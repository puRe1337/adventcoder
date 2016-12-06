#include <iostream>
#include <string>
#include <stdio.h>
#include <cstdlib>
#define _USE_MATH_DEFINES 
#include <math.h>

int main( ) {
	std::string line_str;
	std::getline( std::cin, line_str );

	int diameter, height, x, y, z;

	if ( sscanf( line_str.c_str( ), "%d,%d,%d,%d,%d", &diameter, &height, &x, &y, &z ) != 5 )
		return 0;

	int fieldsToFill = ( x - 1 ) * ( y - 1 );

	int marshmallow_volume = diameter * diameter * z * height;
	double negative = M_PI * ( double )( ( double )diameter / 2 * ( double )diameter / 2 ) * z * height;
	double positive = ( ( double )marshmallow_volume - negative ) * ( double )fieldsToFill;

	printf( "%.2f\n", round( positive * ( double )100 ) / ( double )100 );


	std::cin.get( );
	return 0;
}
