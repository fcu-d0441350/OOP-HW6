package fcu.iecs.oop.pokemon;

public class GYM {
	public static Player fight(Player...players)
	{
		int win1=0,win2=0;
		int i;
		for(i=0;i<=2;i++)
		{
			Pokemon[] pokemons1=players[0].getPokemons();
			Pokemon[] pokemons2=players[1].getPokemons();
			if(pokemons1[i].getType()==PokemonType.FIRE && pokemons2[i].getType()==PokemonType.GRASS)
			{
				win1++;
			}
			else if(pokemons1[i].getType()==PokemonType.GRASS && pokemons2[i].getType()==PokemonType.WATER)
			{
				win1++;
			}
			else if(pokemons1[i].getType()==PokemonType.WATER && pokemons2[i].getType()==PokemonType.FIRE)
			{
				win1++;
			}
			else if(pokemons1[i].getType()==PokemonType.FIRE && pokemons2[i].getType()==PokemonType.WATER)
			{
				win2++;
			}
			else if(pokemons1[i].getType()==PokemonType.GRASS && pokemons2[i].getType()==PokemonType.FIRE)
			{
				win2++;
			}
			else if(pokemons1[i].getType()==PokemonType.WATER && pokemons2[i].getType()==PokemonType.GRASS)
			{
				win2++;
			}
			else if(pokemons1[i].getType()==pokemons2[i].getType() && pokemons1[i].getCp()!=pokemons2[i].getCp())
			{
				if(pokemons1[i].getCp() > pokemons2[i].getCp())
				{
					win1++;
				}
				else if(pokemons1[i].getCp() < pokemons2[i].getCp())
				{
					win2++;
				}
			}
			else if(pokemons1[i].getType()==pokemons2[i].getType() && pokemons1[i].getCp()==pokemons2[i].getCp())
			{
				if((int)(Math.random()*10)<6)
				{
					win1++;
				}
				else
				{
					win2++;
				}
			}
		}
		if(win1==2)
		{
			players[0].setLevel(players[0].getLevel()+1);
			System.out.println("Winner is [" + players[0].getPlayerName() + "], and his/her level becomes [" + players[0].getLevel() + "]");
			return players[0];
		}
		else
		{
			players[1].setLevel(players[1].getLevel()+1);
			System.out.println("Winner is [" + players[1].getPlayerName() + "], and his/her level becomes [" + players[1].getLevel() + "]");
			return players[1];
		}
		
		
	}

}
