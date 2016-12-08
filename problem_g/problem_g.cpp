#include <iostream>
#include <string>
#include <vector>
#include <sstream>

void split( std::string& s, char find, std::vector< std::string >& elements ) {
	std::stringstream ss( s );
	std::string item;
	while ( getline( ss, item, find ) ) {
		elements.push_back( item );
	}
}

std::vector< std::string > split( std::string& s, char find ) {
	std::vector< std::string > elements;
	split( s, find, elements );
	return elements;
}

bool is_upper( const std::string& str ) {
	int upper = 0;
	for ( size_t i = 0; i < str.size( ); i++ ) {
		if ( isupper( str.at( i ) ) )
			upper++;
	}
	return upper == str.size(  );
}


int main( ) {
	std::string line_str;
	std::getline( std::cin, line_str );
	std::vector< std::string > splitted = split( line_str, ' ' );


	for ( size_t i = 0; i < splitted.size( ); i++ ) {
		std::string cur_str = splitted.at( i );
		for ( size_t j = 0; j < cur_str.size( ); j++ ) {
			if ( isspace( cur_str.at( j ) ) && isspace( cur_str.at( j + 1 ) ) )
				cur_str.erase( cur_str.begin( ) + j + 1 );
			if ( j != 0 && isupper( cur_str.at( j ) ) && !is_upper( cur_str ) )
				cur_str.at( j ) = tolower( cur_str.at( j ) );
		}
		splitted.at( i ) = cur_str;
	}
	std::string out_str;
	for ( auto lul : splitted )
	{
		if ( lul.find_first_not_of( ' ' ) != std::string::npos ) {
			lul != splitted.back( ) ? out_str += lul += std::string( " " ) : out_str += lul;
		}
	}
	for ( size_t i = 0; i < out_str.size( ); i++ ) {
		if ( out_str.at( i ) == '.' || out_str.at( i ) == '!' || out_str.at( i ) == '?' )
			out_str.insert( i, "hallo" );
	}
	std::cout << out_str << std::endl;
	std::cin.get( );
	return 0;
}
