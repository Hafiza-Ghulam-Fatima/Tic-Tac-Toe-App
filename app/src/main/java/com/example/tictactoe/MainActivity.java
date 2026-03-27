package com.example.tictactoe;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button[][] buttons = new Button[3][3];
    private String[][] board = new String[3][3];

    private boolean isPlayerX = true;
    private boolean gameOver = false;

    private TextView tvStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvStatus = findViewById(R.id.tvStatus);

        int[][] ids = {
                {R.id.btn00, R.id.btn01, R.id.btn02},
                {R.id.btn10, R.id.btn11, R.id.btn12},
                {R.id.btn20, R.id.btn21, R.id.btn22}
        };

        for (int r = 0; r < 3; r++) {

            for (int c = 0; c < 3; c++) {

                buttons[r][c] = findViewById(ids[r][c]);

                final int row = r;
                final int col = c;

                buttons[r][c].setOnClickListener(v -> handleMove(row, col));
            }
        }

        findViewById(R.id.btnRestart).setOnClickListener(v -> resetGame());

        resetGame();
    }

    private void handleMove(int row, int col) {

        if (gameOver || !board[row][col].equals("")) return;

        String player = isPlayerX ? "X" : "O";

        board[row][col] = player;

        buttons[row][col].setText(player);

        buttons[row][col].setEnabled(false);

        buttons[row][col].setTextColor(
                isPlayerX ? Color.parseColor("#E94560") : Color.parseColor("#0F3460")
        );

        if (checkWinner(player)) {

            tvStatus.setText("Player " + player + " Wins! 🎉");

            gameOver = true;

        } else if (isBoardFull()) {

            tvStatus.setText("It's a Draw! 🤝");

            gameOver = true;

        } else {

            isPlayerX = !isPlayerX;

            tvStatus.setText("Player " + (isPlayerX ? "X" : "O") + "'s Turn");
        }
    }

    private boolean checkWinner(String p) {

        for (int i = 0; i < 3; i++) {

            if (board[i][0].equals(p) &&
                    board[i][1].equals(p) &&
                    board[i][2].equals(p)) return true;

            if (board[0][i].equals(p) &&
                    board[1][i].equals(p) &&
                    board[2][i].equals(p)) return true;
        }

        if (board[0][0].equals(p) &&
                board[1][1].equals(p) &&
                board[2][2].equals(p)) return true;

        if (board[0][2].equals(p) &&
                board[1][1].equals(p) &&
                board[2][0].equals(p)) return true;

        return false;
    }

    private boolean isBoardFull() {

        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                if (board[r][c].equals("")) return false;

        return true;
    }

    private void resetGame() {

        gameOver = false;

        isPlayerX = true;

        tvStatus.setText("Player X's Turn");

        for (int r = 0; r < 3; r++) {

            for (int c = 0; c < 3; c++) {

                board[r][c] = "";

                buttons[r][c].setText("");

                buttons[r][c].setEnabled(true);
            }
        }
    }
}