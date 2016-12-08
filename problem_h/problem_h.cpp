#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <string>
#include <stdio.h>
#include <cstdlib>
#include <vector>

struct Point
{
	Point( int x, int y ) : x(x),y(y) {}
	int x, y;
};

//http://www.mathopenref.com/coordpolygonarea2.html
double polygonArea( std::vector<Point> points, int numPoints )
{
	int area = 0;			// Accumulates area in the loop
	int j = numPoints - 1;  // The last vertex is the 'previous' one to the first

	for ( int i = 0; i<numPoints; i++ )
	{
		area = area + ( points[ j ].x + points[ i ].x ) * ( points[ j ].y - points[ i ].y );
		j = i;  //j is previous vertex to i
	}
	return area / 2;
}

int main( ) {
	std::string line_str;
	std::vector<Point> v_points;

	while ( line_str.compare( "end" ) != 0 ) {
		std::getline( std::cin, line_str );
		int x, y;
		if ( sscanf( line_str.c_str( ), "%d %d", &x, &y ) != 2 )
			continue;

		v_points.push_back( Point( x, y ) );
	}

	double kp = polygonArea( v_points, v_points.size( ) );

	printf( "%.2f\n", kp );

	std::cin.get( );
	return 0;
}
