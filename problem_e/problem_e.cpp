#include <iostream>
#include <string>
#include <stdio.h>
#include <cstdlib>
#include <vector>
#include <sstream>

struct stSimpleParse
{
	std::string duration;
	std::string first_time;
	std::string second_time;
};

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

int main( ) {
	std::string line_str;
	std::getline( std::cin, line_str );
	int amountOfShops = atoi( line_str.c_str( ) );
	std::vector<stSimpleParse> v_simpleparse;
	for ( int i = 0; i < amountOfShops; i++ ) {
		line_str.clear( );
		std::getline( std::cin, line_str );

		std::vector< std::string > duration = split( line_str, ';' );
		std::vector<std::string> times;
		if ( duration.at( 1 ).find_first_of( ' ' ) != std::string::npos )
			times = split( duration.at( 1 ), ' ' );
		else
			times.push_back( duration.at( 1 ) );

		stSimpleParse simple_parse;
		simple_parse.duration = duration.at( 0 );
		simple_parse.first_time = times.at( 0 );
		if ( times.size( ) > 1 )
			simple_parse.second_time = times.at( 1 );
		else
			simple_parse.second_time = "error"; 
		v_simpleparse.push_back( simple_parse );
	}
	for ( auto parse : v_simpleparse )
		std::cout << parse.duration << ";" << parse.first_time << " " << parse.second_time << std::endl;
	std::cin.get( );
	return 0;
}
