package com.maartenmusic.jokegenerator.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class GetJokeServiceImpl implements GetJokeService{

    private ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }


}
