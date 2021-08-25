package m9.Task_1;

import java.util.*;

public class Service {
    private Map<Gamer, List<Game>> account = new HashMap<>();

    public Service() {
    }

    public Service(Map<Gamer, List<Game>> account) {
        this.account = account;
    }


    public String register(Gamer gamer, List<Game> games) {
        if (!checker(gamer)) {
            this.account.put(gamer, games);
            return "пользователь зарегистрирован";
        } else {
            return "такой пользователь существует";
        }

    }

    private boolean checker(Gamer gamer) {
        boolean isEmp = false;
        for (Map.Entry<Gamer, List<Game>> entry : account.entrySet()) {
            isEmp = entry.getKey().getName().equalsIgnoreCase(gamer.getName());
        }
        return isEmp;
    }

    public void addRate(Gamer gamer, Game game, long rate) {
        for (Map.Entry<Gamer, List<Game>> entry : account.entrySet()) {
            String str = entry.getKey().getName();
            if (str.equalsIgnoreCase(gamer.getName())) {
                for (Game k : entry.getValue()) {
                    if (k.getTitle().equalsIgnoreCase(game.getTitle())) {
                        k.setRate(k.getRate() + rate);
                    }
                }
            }
        }
    }

    public long getRatePerName(Gamer gamer, Game game) {
        for (Map.Entry<Gamer, List<Game>> entry : account.entrySet()) {
            String str = entry.getKey().getName();
            if (str.equalsIgnoreCase(gamer.getName())) {
                for (Game k : entry.getValue()) {
                    if (k.getTitle().equalsIgnoreCase(game.getTitle())) {
                        return k.getRate();
                    }
                }
            }
        }
        return -1;
    }

    public Set<String> getGamesList() {
        Set<String> games = new TreeSet<>();
        for (Map.Entry<Gamer, List<Game>> entry : account.entrySet()) {
            entry.getValue().forEach(v -> games.add(v.getTitle()));
        }
        return games;
    }

    public void plaing(Gamer gamer, Game game){
        long z =  new Plaing().play(gamer, game);
        addRate(gamer, game, z);
    }

    public Map<Long, String> topList(Game game) {
        Map<Long, String> list = new TreeMap<>(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return -o1.compareTo(o2);
            }
        });
        for (Map.Entry<Gamer, List<Game>> entry : account.entrySet()) {
            for (Game k : entry.getValue()) {
                if (k.getTitle().equalsIgnoreCase(game.getTitle())) {
                    list.put(k.getRate(), entry.getKey().getName());
                }
            }
        }
        return list;
    }

    public Map<Long, String> topListAllGames() {
        Map<Long, String> list = new TreeMap<>(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                return -o1.compareTo(o2);
            }
        });
        for (Map.Entry<Gamer, List<Game>> entry : account.entrySet()) {
            long countRate = 0;
            for (Game k : entry.getValue()) {
                countRate += k.getRate();
            }
            list.put(countRate, entry.getKey().getName());
        }
        return list;
    }

}
