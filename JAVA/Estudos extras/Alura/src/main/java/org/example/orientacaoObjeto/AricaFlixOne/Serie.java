package org.example.orientacaoObjeto.AricaFlixOne;

public class Serie extends Titulo {
    private int temporada;
    private boolean ativa;
    private int episodioPorTemporada;
    private int minutosPorEpisodio;

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    public void setEpisodioPorTemporada(int episodioPorTemporada) {
        this.episodioPorTemporada = episodioPorTemporada;
    }
@Override
    public int getEpisodioPorTemporada() {
  return  temporada * episodioPorTemporada*minutosPorEpisodio;

    }
}

