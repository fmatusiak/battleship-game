package battleship.shoot;

import battleship.point.Point;
import battleship.players.Player;
import battleship.ship.ListShips;

public class Shoot {

    ListShips listShips;
    CheckerShoot checkerShoot;

    public Shoot(ListShips listShips) {
        this.listShips = listShips;
        checkerShoot = new CheckerShoot(listShips);
    }

    public int shootArea(Point point, Player enemyPlayer) {
        int hitOrSunkShip = checkerShoot.checkAttackPoint(point, enemyPlayer);

        if (hitOrSunkShip == 1) {
            System.out.println("Hit");
            return 1;
        } else if (hitOrSunkShip == 2) {
            System.out.println("Sunk");
            return 2;
        } else if (hitOrSunkShip == 0) {
            System.out.println("Miss");
            return 0;
        }

        return -1;
    }
}
