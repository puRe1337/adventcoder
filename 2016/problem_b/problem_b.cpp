#include <stdio.h>
#include <iostream>
#include <vector>
#include <string>
#include <algorithm>


int main( ) {
	std::vector< std::pair< std::string, int > > presents;

	std::string line_str;
	while ( std::getline( std::cin, line_str ) ) {
		if ( line_str.compare( "stop" ) == 0 )
			break;

		if ( presents.size( ) == 0 ) {
			presents.push_back( std::make_pair( line_str, 1 ) );
			continue;
		}

		bool found = false;
		std::vector< std::pair< std::string, int > >::iterator asdf_it;
		for ( std::vector< std::pair< std::string, int > >::iterator it = presents.begin( ); it != presents.end( ); ++it ) {
			if ( it->first.compare( line_str ) == 0 ) {
				found = true;
				asdf_it = it;
				break;
			}
		}
		if ( found )
			asdf_it->second++;
		else
			presents.push_back( std::make_pair( line_str, 1 ) );
	}

	for ( std::vector< std::pair< std::string, int > >::iterator it = presents.begin( ); it != presents.end( ); ++it ) {
		std::string str = it->second > 1 ? it->first + "s" : it->first;
		printf( "%d %s\n", it->second, str.c_str( ) );
	}
	std::cin.get( );
	return 0;
}
