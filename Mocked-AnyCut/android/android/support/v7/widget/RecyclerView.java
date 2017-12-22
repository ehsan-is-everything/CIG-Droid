package android.support.v7.widget;

import java.util.List;

import com.andreadec.musicplayer.SearchResultsAdapter;

import android.view.View;
import android.view.ViewGroup;
import gov.nasa.jpf.symbc.Debug;

public class RecyclerView extends ViewGroup {

	public void setAdapter(Adapter adapter) {
		// bail out if layout is frozen
		// setLayoutFrozen(false);
		// setAdapterInternal(adapter, false, true);
		// requestLayout();
		Debug.printSymbolicRef(adapter,"VALUE OF adapter in ADAPTER method!!!");
	}

	public static abstract class ViewHolder {

		public ViewHolder(View view) {
			// TODO Auto-generated constructor stub
		}

	}

	public static abstract class LayoutManager {

	}

	public static abstract class Adapter<VH extends ViewHolder> {
		// private final AdapterDataObservable mObservable = new
		// AdapterDataObservable();
		// private boolean mHasStableIds = false;

		public abstract VH onCreateViewHolder(ViewGroup parent, int viewType);

		public abstract void onBindViewHolder(VH holder, int position);

		public void onBindViewHolder(VH holder, int position, List<Object> payloads) {
			onBindViewHolder(holder, position);
		}

		public final VH createViewHolder(ViewGroup parent, int viewType) {
			// TraceCompat.beginSection(TRACE_CREATE_VIEW_TAG);
			// final VH holder = onCreateViewHolder(parent, viewType);
			// holder.mItemViewType = viewType;
			// TraceCompat.endSection();
			return null;
		}

		public final void bindViewHolder(VH holder, int position) {
			// holder.mPosition = position;
			// if (hasStableIds()) {
			// holder.mItemId = getItemId(position);
			// }
			// holder.setFlags(ViewHolder.FLAG_BOUND,
			// ViewHolder.FLAG_BOUND | ViewHolder.FLAG_UPDATE | ViewHolder.FLAG_INVALID
			// | ViewHolder.FLAG_ADAPTER_POSITION_UNKNOWN);
			// TraceCompat.beginSection(TRACE_BIND_VIEW_TAG);
			// onBindViewHolder(holder, position, holder.getUnmodifiedPayloads());
			// holder.clearPayload();
			// TraceCompat.endSection();
		}

		public int getItemViewType(int position) {
			return 0;
		}

		public void setHasStableIds(boolean hasStableIds) {
			// if (hasObservers()) {
			// throw new IllegalStateException("Cannot change whether this adapter has " +
			// "stable IDs while the adapter has registered observers.");
			// }
			// mHasStableIds = hasStableIds;
		}

		public long getItemId(int position) {
			return 0;
		}

		public abstract int getItemCount();

		public final boolean hasStableIds() {
			return false;
		}

		public void onViewRecycled(VH holder) {
		}

		public boolean onFailedToRecycleView(VH holder) {
			return false;
		}

		public void onViewAttachedToWindow(VH holder) {
		}

		public void onViewDetachedFromWindow(VH holder) {
		}

		public final boolean hasObservers() {
			return false;
		}

		// public void registerAdapterDataObserver(AdapterDataObserver observer) {
		// mObservable.registerObserver(observer);
		// }
		// public void unregisterAdapterDataObserver(AdapterDataObserver observer) {
		// mObservable.unregisterObserver(observer);
		// }
		public void onAttachedToRecyclerView(RecyclerView recyclerView) {
		}

		public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
		}

		public final void notifyDataSetChanged() {
			// mObservable.notifyChanged();
		}

		public final void notifyItemChanged(int position) {
			// mObservable.notifyItemRangeChanged(position, 1);
		}

		public final void notifyItemChanged(int position, Object payload) {
			// mObservable.notifyItemRangeChanged(position, 1, payload);
		}

		public final void notifyItemRangeChanged(int positionStart, int itemCount) {
			// mObservable.notifyItemRangeChanged(positionStart, itemCount);
		}

		public final void notifyItemRangeChanged(int positionStart, int itemCount, Object payload) {
			// mObservable.notifyItemRangeChanged(positionStart, itemCount, payload);
		}

		public final void notifyItemInserted(int position) {
			// mObservable.notifyItemRangeInserted(position, 1);
		}

		public final void notifyItemMoved(int fromPosition, int toPosition) {
			// mObservable.notifyItemMoved(fromPosition, toPosition);
		}

		public final void notifyItemRangeInserted(int positionStart, int itemCount) {
			// mObservable.notifyItemRangeInserted(positionStart, itemCount);
		}

		public final void notifyItemRemoved(int position) {
			// mObservable.notifyItemRangeRemoved(position, 1);
		}

		public final void notifyItemRangeRemoved(int positionStart, int itemCount) {
			// mObservable.notifyItemRangeRemoved(positionStart, itemCount);
		}
	}

	public void setLayoutManager(LinearLayoutManager llm) {
		// TODO Auto-generated method stub
		
	}

}
