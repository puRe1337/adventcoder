#include <iostream>
#include <unordered_map>
#include <string>

int main( ) {
	std::unordered_map< std::string, int > presents;

	std::string line_str;
	while ( std::getline( std::cin, line_str ) ) {
		if ( line_str.compare( "stop" ) == 0 )
			break;
		presents[ line_str ]++;
	}

	for ( auto present : presents ) {
		auto str = present.second > 1 ? present.first + "s" : present.first;
		printf( "%d %s\n", present.second, str.c_str( ) );
	}
	return 0;
}
