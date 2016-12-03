#include <iostream>
#include <string>
#include <string>
#include <sstream>
#include <vector>
#include <cassert>
#include <algorithm> 

void split( const std::string& s, char delim, std::vector< std::string >& elems ) {
	std::stringstream ss;
	ss.str( s );
	std::string item;
	while ( std::getline( ss, item, delim ) ) {
		elems.push_back( item );
	}
}


std::vector< std::string > split( const std::string& s, char delim ) {
	std::vector< std::string > elems;
	split( s, delim, elems );
	return elems;
}


struct Point
{
	Point( int x, int y ) : x( x ), y( y ) {}

	int x, y;

	bool equals( Point& other ) const {
		if ( x == other.x && y == other.y )
			return true;
		return false;
	}
};

bool onSegment( Point p, Point q, Point r ) {
	if ( q.x <= std::max( p.x, r.x ) && q.x >= std::min( p.x, r.x ) &&
		q.y <= std::max( p.y, r.y ) && q.y >= std::min( p.y, r.y ) )
		return true;

	return false;
}

int orientation( Point p, Point q, Point r ) {
	int val = ( q.y - p.y ) * ( r.x - q.x ) -
		( q.x - p.x ) * ( r.y - q.y );

	if ( val == 0 ) return 0;

	return ( val > 0 ) ? 1 : 2;
}


bool doIntersect( Point p1, Point q1, Point p2, Point q2 ) {
	int o1 = orientation( p1, q1, p2 );
	int o2 = orientation( p1, q1, q2 );
	int o3 = orientation( p2, q2, p1 );
	int o4 = orientation( p2, q2, q1 );

	if ( o1 != o2 && o3 != o4 )
		return true;
	if ( o1 == 0 && onSegment( p1, p2, q1 ) ) return true;
	if ( o2 == 0 && onSegment( p1, q2, q1 ) ) return true;
	if ( o3 == 0 && onSegment( p2, p1, q2 ) ) return true;
	if ( o4 == 0 && onSegment( p2, q1, q2 ) ) return true;

	return false;
}


int main( ) {
	int inputcounter = 0;
	int input_x[ 4 ] = { 0 };
	int input_y[ 4 ] = { 0 };

	while ( inputcounter < 4 ) {
		std::string line_str;
		std::getline( std::cin, line_str );
		std::vector< std::string > splitted = split( line_str, ',' );
		assert( splitted.size( ) == 2 );
		input_x[ inputcounter ] = atoi( splitted.at( 0 ).c_str( ) );
		input_y[ inputcounter ] = atoi( splitted.at( 1 ).c_str( ) );
		inputcounter++;
	}

	int x1 = input_x[ 0 ];
	int y1 = input_y[ 0 ];
	int x2 = input_x[ 1 ];
	int y2 = input_y[ 1 ];
	int x3 = input_x[ 2 ];
	int y3 = input_y[ 2 ];
	int x4 = input_x[ 3 ];
	int y4 = input_y[ 3 ];

	Point p1 = Point( x1, y1), q1 = Point( x2, y2 );
	Point p2 = Point( x3, y3), q2 = Point( x4, y4 );

	if ( p1.equals( q2 ) || p2.equals( q1 ) ) {
		std::cout << "not crossing\n";
	}
	else {
		doIntersect( p1, q1, p2, q2 ) ? std::cout << "crossing\n" : std::cout << "not crossing\n";
	}

	std::cin.get( );
	return 0;
}
