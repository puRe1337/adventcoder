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
	size_t upper = 0;
	for ( size_t i = 0; i < str.size( ); i++ ) {
		if ( isupper( str.at( i ) ) )
			upper++;
		else if ( !isalpha( str.at( i ) ) )
			upper++;
	}
	return upper == str.size( );
}

bool is_space( const std::string& str ) {
	size_t spaces = 0;
	for ( size_t i = 0; i < str.size( ); i++ ) {
		if ( isspace( str.at( i ) ) )
			spaces++;
	}
	return spaces == str.size( );
}

int main( ) {
	std::string line_str;
	do {
		std::getline( std::cin, line_str );

		for ( size_t i = 0; i < line_str.size( ); i++ ) {
			if ( ( line_str.at( i ) == '.' || line_str.at( i ) == '!' || line_str.at( i ) == '?' ) && i != line_str.size( ) ) {
				line_str.insert( i + 1, " " );
				if ( i + 2 > line_str.size( ) )
					line_str.at( i + 2 ) = toupper( line_str.at( i + 2 ) );
			}
		}

		std::vector< std::string > splitted = split( line_str, ' ' );


		for ( size_t i = 0; i < splitted.size( ); i++ ) {
			std::string cur_str = splitted.at( i );
			for ( size_t j = 0; j < cur_str.size( ); j++ ) {
				if ( isspace( cur_str.at( j ) ) && isspace( cur_str.at( j + 1 ) ) )
					cur_str.erase( cur_str.begin( ) + j + 1 );
				if ( j != 0 && isupper( cur_str.at( j ) ) && isalpha( cur_str.at( j ) ) && !is_upper( cur_str ) )
					cur_str.at( j ) = tolower( cur_str.at( j ) );
			}
			splitted.at( i ) = cur_str;
		}
		std::string out_str;
		for ( size_t i = 0; i < splitted.size( ); i++ ) {
			std::string lul = splitted.at( i );
			if ( lul.find_first_not_of( ' ' ) != std::string::npos ) {
				lul != splitted.back( ) ? out_str += lul += std::string( " " ) : out_str += lul;
			}
		}
		if ( !out_str.empty( ) && !is_space( out_str ) )
			std::cout << out_str << std::endl;
	}
	while ( !line_str.empty( ) );
	std::cin.get( );
	return 0;
}
