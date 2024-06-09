package _04_Snake;

import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public enum Direction {
	UP(0, 1, KeyEvent.VK_UP),
	DOWN(0, -1, KeyEvent.VK_DOWN),
	LEFT(-1, 0, KeyEvent.VK_LEFT),
	RIGHT(1, 0, KeyEvent.VK_RIGHT);

	static class Helper {
		static Map<Integer, Direction> keybindings = new HashMap<>();
	}

	public final int xOffset;
	public final int yOffset;

	Direction(int xOffset, int yOffset, int keybind) {
		this.xOffset = xOffset;
		this.yOffset = yOffset;
		Helper.keybindings.put(keybind, this);
	}

	static Optional<Direction> get(int keyCode) {
		return Optional.ofNullable(Helper.keybindings.get(keyCode));
	}

}
