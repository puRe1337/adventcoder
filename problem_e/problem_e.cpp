#include <iostream>
#include <string>
#include <stdio.h>
#include <cstdlib>
#include <vector>
#include <sstream>

struct stShopInfo
{
	stShopInfo( ) : durationMinutes( -1 ), durationSeconds( -1 ), firstOpenHour( -1 ), firstOpenMinute( -1 ), firstCloseHour( -1 ), firstCloseMinute( -1 ), secondOpenHour( -1 ), secondOpenMinute( -1 ), secondCloseHour( -1 ), secondCloseMinute( -1 ) {}

	int durationMinutes;
	int durationSeconds;

	int firstOpenHour;
	int firstOpenMinute;
	int firstCloseHour;
	int firstCloseMinute;

	int secondOpenHour;
	int secondOpenMinute;
	int secondCloseHour;
	int secondCloseMinute;
};

int main( ) {
	const int TRAVEL_TIME = 20;
	std::string line_str;
	std::getline( std::cin, line_str );
	int amountOfShops = atoi( line_str.c_str( ) );
	std::vector< stShopInfo > v_shopinfo;
	for ( int i = 0; i < amountOfShops; i++ ) {
		line_str.clear( );
		std::getline( std::cin, line_str );

		if ( line_str.length( ) > 16 ) {
			stShopInfo shop_info;
			sscanf_s( line_str.c_str( ), "%d:%d;%d:%d-%d:%d %d:%d-%d:%d",
			          &shop_info.durationMinutes, &shop_info.durationSeconds,
			          &shop_info.firstOpenHour, &shop_info.firstOpenMinute,
			          &shop_info.firstCloseHour, &shop_info.firstCloseMinute,
			          &shop_info.secondOpenHour, &shop_info.secondOpenMinute,
			          &shop_info.secondCloseHour, &shop_info.secondCloseMinute );
			v_shopinfo.push_back( shop_info );
		}
		else {
			stShopInfo shop_info;
			sscanf_s( line_str.c_str( ), "%d:%d;%d:%d-%d:%d",
			          &shop_info.durationMinutes, &shop_info.durationSeconds,
			          &shop_info.firstOpenHour, &shop_info.firstOpenMinute,
			          &shop_info.firstCloseHour, &shop_info.firstCloseMinute );
			v_shopinfo.push_back( shop_info );

		}
	}
	for ( auto shop_info : v_shopinfo )
		printf( "%d:%02d;%d:%02d-%d-%02d %d:%02d-%d-%02d\n",
		        shop_info.durationMinutes, shop_info.durationSeconds,
		        shop_info.firstOpenHour, shop_info.firstOpenMinute,
		        shop_info.firstCloseHour, shop_info.firstCloseMinute,
		        shop_info.secondOpenHour, shop_info.secondOpenMinute,
		        shop_info.secondCloseHour, shop_info.secondCloseMinute );
	std::cin.get( );
	return 0;
}
