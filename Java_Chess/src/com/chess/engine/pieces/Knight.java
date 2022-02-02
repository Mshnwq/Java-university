package com.chess.engine.pieces;

import com.chess.engine.board.Tile;
import com.chess.engine.Alliance;
import com.chess.engine.board.Board;
import com.chess.engine.board.BoardUtils;
import com.chess.engine.board.Move;
import com.google.common.collect.ImmutableList;

import static com.chess.engine.board.Move.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;


public class Knight extends Piece {

	// Moves for knight by offset, with respect to a current position
	private final static int[] CANDIDATE_MOVE_COORDINATES = { -17, -15, -10, -6, 6, 10, 15, 17 };

	public Knight(final Alliance pieceAlliance, final int piecePosition) {
		super(PieceType.KNIGHT, pieceAlliance, piecePosition);
	}

	@Override
	public Collection<Move> calculateLegalMoves(final Board board) {

		final List<Move> legalMoves = new ArrayList<>();

		//loop through offsets
		for(final int currentCandidateOffset : CANDIDATE_MOVE_COORDINATES) {

			final int candidateDestinationCoordinate = this.piecePosition + currentCandidateOffset;

			if(BoardUtils.isValidTileCoordinate(candidateDestinationCoordinate)) {

				if(isFirstColumnExclusion(this.piecePosition, currentCandidateOffset)
						|| isSecondColumnExclusion(this.piecePosition, currentCandidateOffset)
						|| isSeventhColumnExclusion(this.piecePosition, currentCandidateOffset)
						|| isEighthColumnExclusion(this.piecePosition, currentCandidateOffset)) {
					continue;
				}
				// non-attacking legal mo(
				final Tile candidateDestinationTile = board.getTile(candidateDestinationCoordinate);

				if(!candidateDestinationTile.isTileOccupied()) {
					legalMoves.add(new MajorMove(board, this, candidateDestinationCoordinate));
				}
				else {
					final Piece pieceAtDestination = candidateDestinationTile.getPiece();
					final Alliance pieceAlliance = pieceAtDestination.getPieceAlliance();

					//able to get onto enemy piece
					if(this.pieceAlliance != pieceAlliance) {
						legalMoves.add(new AttackMove(board, this, candidateDestinationCoordinate, pieceAtDestination));
					}
				}
			}
		}
		return ImmutableList.copyOf(legalMoves);
	}

	@Override
	public Knight movePiece(final Move move) {
		return new Knight(move.getMovedPiece().getPieceAlliance(), move.getDestinationCoordinate());
	}

	@Override
	public String toString() {
		return PieceType.KNIGHT.toString();
	}

	//some move exceptions
	private static boolean isFirstColumnExclusion(final int currentPosition, final int candidateOffset) {

		return BoardUtils.FIRST_COLUMN[currentPosition] && ((candidateOffset == -17) || (candidateOffset == -10)
				|| (candidateOffset == 6) || (candidateOffset == 15));
	}

	private static boolean isSecondColumnExclusion(final int currentPosition, final int candidateOffset) {

		return BoardUtils.SECOND_COLUMN[currentPosition] && ((candidateOffset == -10) || (candidateOffset == 6));
	}
	private static boolean isSeventhColumnExclusion(final int currentPosition, final int candidateOffset) {

		return BoardUtils.SEVENTH_COLUMN[currentPosition] && ((candidateOffset == -6) || (candidateOffset == 10));
	}
	private static boolean isEighthColumnExclusion(final int currentPosition, final int candidateOffset) {

		return BoardUtils.EIGHTH_COLUMN[currentPosition] && ((candidateOffset == -15) || (candidateOffset == -6)
				|| (candidateOffset == 10) || (candidateOffset == 17));
	}
}
